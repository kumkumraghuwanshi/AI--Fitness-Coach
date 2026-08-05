package service;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.User;
import java.util.ArrayList;
import java.util.List;
import dao.UserDAO;

public class UserService {
    private List<User> users = new ArrayList<>();
    private UserDAO userDAO = new UserDAO();
    private User selectedUser;
    private Calculator calculator = new Calculator();

    public void addUser(User user){
        users.add(user);
        System.out.println("User added successfully.");
        System.out.println("Total Users = " + users.size());
    }

    public void updateUser(User user, Scanner sc) {

        System.out.println("\n===== Update User =====");

        System.out.print("Enter New Name: ");
        user.setName(sc.nextLine());

        System.out.print("Enter New Age: ");
        user.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter New Gender: ");
        user.setGender(sc.nextLine());

        System.out.print("Enter New Height (cm): ");
        user.setHeight(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter New Weight (kg): ");
        user.setWeight(sc.nextDouble());
        sc.nextLine();

        System.out.println("User updated successfully.");
    }

    public boolean userExists(String name) {

        for(User user : users){
            if(user.getName().equalsIgnoreCase(name)){
                return true;
            }
        }

        return false;
    }

    public void setSelectedUser(User user) {
        selectedUser = user;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public UserService(){

    }
    public void registerUser(Scanner sc){
    User user = new User();
    System.out.println("Enter Name: ");
    String name = sc.nextLine();
        if(userExists(name)){
            System.out.println("User already exists.");
            return;
        }
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

        calculator.displayFitnessReport(user);
        userDAO.saveUser(user);
    }

    // from here MYSQL starts
    public void viewAllUsersFromDatabase() {

        List<User> users = userDAO.getAllUsers();

        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }

        for (User user : users) {
            System.out.println("----------------------------");
            System.out.println("ID : " + user.getId());
            System.out.println("Name : " + user.getName());
            System.out.println("Age : " + user.getAge());
            System.out.println("Gender : " + user.getGender());
            System.out.println("Height : " + user.getHeight());
            System.out.println("Weight : " + user.getWeight());
            System.out.println("Goal : " + user.getGoal());
            System.out.println("----------------------------");
        }
    }
    public User searchUserByIdFromDatabase(int id) {
        return userDAO.searchUserById(id);
    }
    public void updateUserInDatabase(User user) {
        userDAO.updateUser(user);
    }
    public boolean deleteUserFromDatabase(int id) {
        return userDAO.deleteUser(id);
    }
}
