package service;
import model.User;

public class Calculator {
    //BMI (Body Mass Index)
    public double calculateBMI(double height, double weight){
        double bmi;
        if(height<=0){
            System.out.println("Invalid Height");
            return 0;
        }
        else{
            double heightInMeters = height/100 ;
            bmi = weight/(heightInMeters * heightInMeters);
        }return bmi;
    }
    public String getBMICategory(double bmi){
        if(bmi < 18.5){
            return "Under Weight";
        }else if (bmi <= 24.9){
            return "Normal Weight";
        }else if (bmi <= 29.9){
            return "Over Weight";
        }else{
            return "Obese";
        }
    }
    public void displayBMI(User user){
        double bmi = calculateBMI(user.getHeight(),user.getWeight());
        System.out.printf("BMI : %.2f%n", bmi);
        String bmiCategory = getBMICategory(bmi);
        System.out.println(bmiCategory);
        user.setBmi(bmi);
        user.setBmiCategory(bmiCategory);
    }

    //BMR (Basal Metabolic Rate)
    public double calculateBMR(double weight, double height, int age, String gender ){
        double bmr;

        if(weight <= 0  || height <= 0  || age <= 0){
            System.out.println("Invalid Input");
            return 0;
        }
        if ("Male".equalsIgnoreCase(gender)){
            bmr = 10 * weight + 6.25 * height - 5 * age + 5;
        }else if ("Female".equalsIgnoreCase(gender)){
            bmr = 10 * weight + 6.25 * height - 5 * age - 161;
        }else{
            System.out.println("Invalid Gender");
            return 0;
        }
            return bmr;
    }
    public void displayBMR(User user){
        double bmr = calculateBMR(user.getWeight(),user.getHeight() , user.getAge(),user.getGender());
        System.out.printf("BMR : %.2f Calories/day%n", bmr);
        user.setBmr(bmr);
    }

    // TDEE (Total Daily Energy Expenditure)
    public double calculateTDEE(double bmr , String activitylevel){
        double tdee;

        if (bmr <= 0){
            return 0;
        }
        if ("Sedentary".equalsIgnoreCase(activitylevel)){
            tdee = bmr * 1.2;
        }else if ("Lightly Active".equalsIgnoreCase(activitylevel)){
            tdee = bmr * 1.375;
        }else if ("Moderately Active".equalsIgnoreCase(activitylevel)){
            tdee = bmr * 1.55;
        }else if ("Very Active".equalsIgnoreCase(activitylevel)){
            tdee = bmr * 1.725;
        }else if ("Extra Active".equalsIgnoreCase(activitylevel)){
            tdee = bmr * 1.9;
        }else {
            System.out.println("Invalid Activity Level");
            return 0;
        }
        return tdee;
    }
    public void displayTdee(User user){
        double bmrForTdee = calculateBMR(user.getWeight(), user.getHeight(),user.getAge(),user.getGender());
        double tdee = calculateTDEE(bmrForTdee,user.getActivitylevel());
        System.out.printf("TDEE : %.2f Calories/day%n", tdee);
        user.setTdee(tdee);
    }

    // Water Intake Calculator
    public double calculateWaterIntake(double  weight){
        if (weight <= 0) {
            System.out.println("Invalid Weight");
            return 0;
        }
        double waterIntake = weight * 35; // in ml
        double waterInLiters = waterIntake / 1000 ;

        return waterInLiters ;
    }
    public void displayWaterIntake(User user){
        double waterIntake = calculateWaterIntake(user.getWeight());
        System.out.println("====== Water Intake Calculator ======");
        System.out.println();
        System.out.println("Weight : " + user.getWeight() + " kg");
        System.out.println();
        System.out.printf("Recommended Water Intake : %.2f Liters/day%n" ,waterIntake);
        System.out.println();
        System.out.println("Drink water throughout the day instead of all at once.");
        user.setWaterIntake(waterIntake);
    }

    public void displayFitnessReport(User user){
        displayBMI(user);
        displayBMR(user);
        displayTdee(user);
        displayWaterIntake(user);
    }
}
