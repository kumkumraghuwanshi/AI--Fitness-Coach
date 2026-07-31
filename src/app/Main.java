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
        UserService userService = new UserService();
        ProfileService profileService = new ProfileService();

        int choice = 0 ;
        do{
            System.out.println("==== AI Fitness & Diet Coach ====");
            System.out.println("1. Register User");
            System.out.println("2. View Profile");
            System.out.println("3. Fitness Report");
            System.out.println("4. Diet Recommendation");
            System.out.println("5. Workout Recommendation");
            System.out.println("6. Weekly Workout Schedule");
            System.out.println("7. Save User Data");
            System.out.println("8. View Saved Report");
            System.out.println("9. View All Users");
            System.out.println("10. Search Users");
            System.out.println("11. Update User");
            System.out.println("12. Delete User");
            System.out.println("13. Exit");
            System.out.println("Enter Your Choice:");

            try{
                choice = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid number.");
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            User currentUser ;

            switch (choice){
            case 1 :
                 userService.registerUser(sc);
                 break;

            case 2 :
                currentUser = userService.getSelectedUser();

                if (currentUser == null) {
                    System.out.println("Please search and select a user first.");
                    break;
                }

                profileService.viewProfile(currentUser);
                break;
            case 3 :
                currentUser = userService.getSelectedUser();

                if (currentUser == null) {
                    System.out.println("Please search and select a user first.");
                    break;
                }

                calculator.displayFitnessReport(currentUser);
                break;
            case 4 :
                currentUser = userService.getSelectedUser();

                if (currentUser == null) {
                    System.out.println("Please search and select a user first.");
                    break;
                }

                dietRecommendation.recommendDiet(currentUser, calculator);
                break;
            case 5 :
                currentUser = userService.getSelectedUser();

                if (currentUser == null) {
                    System.out.println("Please search and select a user first.");
                    break;
                }

                workoutRecommendation.recommendWorkout(
                        currentUser.getGoal(),
                        currentUser.getFitnesslevel(),
                        currentUser.getEquipment()
                );
                break;
            case 6 :
                currentUser = userService.getSelectedUser();

                if (currentUser == null) {
                    System.out.println("Please search and select a user first.");
                    break;
                }

                workoutSchedule.showWorkoutSchedule(
                        currentUser.getGoal(),
                        currentUser.getFitnesslevel(),
                        currentUser.getEquipment()
                );
                break;
            case 7 :
                fileManager.saveAllUsers(userService.getAllUsers());
                break;
            case 8 :
                fileManager.readUserData();
                break;
            case 9 :
                userService.viewAllUsers();
                break;
            case 10 :
                System.out.print("Enter User ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                User foundUser = userService.searchUserById(id);

                if (foundUser == null) {
                    System.out.println("User not found.");
                } else {
                    userService.setSelectedUser(foundUser);
                    System.out.println("User selected successfully.");
                }
                break;
            case 11 :
                System.out.print("Enter User ID to update: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                User updateUser = userService.searchUserById(updateId);

                if(updateUser == null){
                    System.out.println("User not found.");
                }
                else{
                    userService.updateUser(updateUser, sc);
                }
                break;
            case 12:

                System.out.print("Enter User ID to delete: ");
                int deleteId = sc.nextInt();
                sc.nextLine();

                boolean deleted = userService.deleteUser(deleteId);

                if(deleted){
                    System.out.println("User deleted successfully.");
                }
                else{
                    System.out.println("User not found.");
                }

                break;
            case 13 :
                System.out.println("Thank you for using AI Fitness & Diet Coach!");
                break;
            default :
                System.out.println();
                System.out.println("Invalid Choice! Please enter 1, 2 or 3.");
            }
        }while (choice != 13);
    }
}
