package app;
import model.User;
import service.*;
import utils.*;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        User user = new User();
        Calculator calculator = new Calculator();
        DietRecommendation dietRecommendation = new DietRecommendation();
        WorkoutRecommendation workoutRecommendation = new WorkoutRecommendation();
        WorkoutSchedule workoutSchedule = new WorkoutSchedule();
        FileManager fileManager = new FileManager();

        int choice = 0 ;
        do{
            System.out.println("==== AI Fitness & Diet Coach ====");
            System.out.println("1. Register User");
            System.out.println("2. View Profile");
            System.out.println("3. Calculate BMI");
            System.out.println("4. Calculate BMR");
            System.out.println("5. Calculate TDEE");
            System.out.println("6. Diet Recommendation");
            System.out.println("7. Workout Recommendation");
            System.out.println("8. Weekly Workout Recommendation");
            System.out.println("9. Water Intake Calculator");
            System.out.println("10. Save User Data");
            System.out.println("11. View Saved Report");
            System.out.println("12. Exit");
            System.out.println("Enter Your Choice:");

            try{
                choice = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }

            switch (choice){
            case 1 :
            // code
            sc.nextLine();
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            user.setName(name);

            System.out.println("Enter Age:");
            int age ;
            while(true){
                try{
                    age = sc.nextInt();
                    if (age <= 0) {
                        System.out.println("Age must be greater than 0.");
                        continue;
                    }
                    break;
                }catch(InputMismatchException e){
                    System.out.println("Please enter a valid age.");
                    sc.nextLine();
                    continue;
                }
            }
            user.setAge(age);
            sc.nextLine();

            System.out.println("Enter Gender:");
            String gender = sc.nextLine();
            user.setGender(gender);

            System.out.println("Enter Height (in cm):");
            double height = 0 ;
                while(true){
                    try{
                        height = sc.nextDouble();
                        if (height <= 0) {
                            System.out.println("Height must be greater than 0.");
                            continue;
                        }
                        break;
                    }catch(InputMismatchException e){
                        System.out.println("Please enter a valid Height.");
                        sc.nextLine();
                        continue;
                    }
                }
            user.setHeight(height);
            sc.nextLine();

            System.out.println("Enter Weight (in kg):");
            double weight ;
                while (true) {
                    try {
                        weight = sc.nextDouble();
                        if (weight <= 0) {
                            System.out.println("Weight must be greater than 0.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid Weight.");
                        sc.nextLine();
                        continue;
                    }
                }
            user.setWeight(weight);
            sc.nextLine();

            System.out.println("Select Goal:");
            // Goal Menu
                String goal = "";
                System.out.println("1. Weight Loss");
                System.out.println("2. Weight Gain");
                System.out.println("3. Muscle Gain");
                System.out.println("4. Maintain Weight");

                int goalChoice = sc.nextInt();
                sc.nextLine();
                switch(goalChoice){
                    case 1:
                        goal = "Weight Loss";
                        break;
                    case 2:
                        goal = "Weight Gain";
                        break;
                    case 3:
                        goal = "Muscle Gain";
                        break;
                    case 4:
                        goal = "Maintain Weight";
                        break;
                    default :
                        System.out.println("Invalid Choice");
                }
            user.setGoal(goal);

            System.out.println("Select FitnessLevel:");
            // FitnessLevel Menu
                String fitnessLevel = "";
                System.out.println("1. Beginner");
                System.out.println("2. Intermediate");
                System.out.println("3. Advanced");

                int fitnessChoice = sc.nextInt();
                sc.nextLine();
                switch (fitnessChoice){
                    case 1:
                        fitnessLevel = "Beginner";
                        break;
                    case 2:
                        fitnessLevel = "Intermediate";
                        break;
                    case 3:
                        fitnessLevel = "Advanced";
                        break;
                    default :
                        System.out.println("Invalid Fitness Level");
                }

            user.setFitnesslevel(fitnessLevel);

            System.out.println("Select Equipments:");
            // Equipments Menu
                String equipment = "";
                System.out.println("1. No Equipment");
                System.out.println("2. Dumbbells");
                System.out.println("3. Resistance Bands");
                System.out.println("4. Full Gym");

                int equipmentChoice = sc.nextInt();
                sc.nextLine();
                switch (equipmentChoice){
                    case 1:
                        equipment = "No Equipment";
                        break;
                    case 2:
                        equipment = "Dumbbells";
                        break;
                    case 3:
                        equipment = "Resistance Bands";
                        break;
                    case 4:
                        equipment = "Full Gym";
                        break;
                    default :
                        System.out.println("Invalid Equipment ");
                }
            user.setEquipment(equipment);

            System.out.println("Select Activity Level:");
            // Activity Level Menu
                String activityLevel = "";
                System.out.println("1. Sedentary");
                System.out.println("2. Lightly Active");
                System.out.println("3. Moderately Active");
                System.out.println("4. Very Active");
                System.out.println("5. Extra Active");

                int activityChoice = sc.nextInt();
                sc.nextLine();
                switch (activityChoice){
                    case 1:
                        activityLevel = "Sedentary";
                        break;

                    case 2:
                        activityLevel = "Lightly Active";
                        break;

                    case 3:
                        activityLevel = "Moderately Active";
                        break;

                    case 4:
                        activityLevel = "Very Active";
                        break;

                    case 5:
                        activityLevel = "Extra Active";
                        break;

                    default:
                        System.out.println("Invalid Activity Level");
                }
            user.setActivitylevel(activityLevel);

            case 2 :
                System.out.println(user.getName());
                System.out.println(user.getAge());
                System.out.println(user.getGender());
                System.out.println(user.getHeight());
                System.out.println(user.getWeight());
                System.out.println(user.getGoal());
                System.out.println(user.getFitnesslevel());
                System.out.println(user.getEquipment());
                System.out.println(user.getActivitylevel());
                break;
            case 3 :
                double bmi = calculator.calculateBMI(user.getHeight(),user.getWeight());
                System.out.printf("BMI : %.2f%n", bmi);
                String bmiCategory = calculator.getBMICategory(bmi);
                System.out.println(bmiCategory);
                user.setBmi(bmi);
                user.setBmiCategory(bmiCategory);
                break;
            case 4 :
                double bmr = calculator.calculateBMR(user.getWeight(),user.getHeight() , user.getAge(),user.getGender());
                System.out.printf("BMR : %.2f Calories/day%n", bmr);
                user.setBmr(bmr);
                break;
            case 5 :
                double bmrForTdee = calculator.calculateBMR(user.getWeight(), user.getHeight(),user.getAge(),user.getGender());
                double tdee = calculator.calculateTDEE(bmrForTdee,user.getActivitylevel());
                System.out.printf("TDEE : %.2f Calories/day%n", tdee);
                user.setTdee(tdee);
                break;
            case 6 :
                double bmrForDiet = calculator.calculateBMR(user.getWeight(), user.getHeight(),user.getAge(),user.getGender());
                double tdeeForDiet = calculator.calculateTDEE(bmrForDiet,user.getActivitylevel());
                dietRecommendation.recommendDiet(user.getGoal(),tdeeForDiet);
                break;
            case 7 :
                workoutRecommendation.recommendWorkout(user.getGoal(), user.getFitnesslevel(), user.getEquipment());
                break;
            case 8 :
                workoutSchedule.showWorkoutSchedule(user.getGoal(), user.getFitnesslevel(), user.getEquipment());
                break;
            case 9 :
                double waterIntake = calculator.calculateWaterIntake(user.getWeight());
                System.out.println("====== Water Intake Calculator ======");
                System.out.println();
                System.out.println("Weight : " + user.getWeight() + " kg");
                System.out.println();
                System.out.printf("Recommended Water Intake : %.2f Liters/day%n" ,waterIntake);
                System.out.println();
                System.out.println("Drink water throughout the day instead of all at once.");
                user.setWaterIntake(waterIntake);
                break;
            case 10 :
                fileManager.saveUserData(user);
                break;
            case 11 :
                fileManager.readUserData();
                break;
            case 12 :
                System.out.println("Thank you for using AI Fitness & Diet Coach!");
                break;
            default :
                System.out.println();
                System.out.println("Invalid Choice! Please enter 1, 2 or 3.");
            }
        }while (choice != 12);
    }
}
