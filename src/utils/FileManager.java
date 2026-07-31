package utils;
import java.io.FileWriter;
import java.io.IOException;
import model.User;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.List;

public class FileManager {
    public void saveAllUsers(List<User> users){
        if (users == null || users.isEmpty()) {
            System.out.println("No user data found.");
            return;
        }
        try {
            FileWriter writer = new FileWriter("UserData.txt");
            for(User user : users){
            writer.write("======== AI Fitness Report ========\n");
            writer.write("\n");
            writer.write("Name : " + user.getName() + "\n");
            writer.write("Age : " + user.getAge() + "\n");
            writer.write("Gender : " + user.getGender() + "\n");
            writer.write("Height : " + user.getHeight() + " cm\n");
            writer.write("Weight : " + user.getWeight() + " kg\n");
            writer.write("\n");
            writer.write("======== Fitness Information ========\n");
            writer.write("\n");
            writer.write("Goal : " + user.getGoal() + "\n");
            writer.write("Fitness Level : " + user.getFitnesslevel() + "\n");
            writer.write("Equipment : " + user.getEquipment() + "\n");
            writer.write("Activity Level : " + user.getActivitylevel() + "\n");
            writer.write("\n");
            writer.write("======== Health Information ========\n");
            writer.write("\n");
            writer.write(String.format("BMI : %.2f%n", user.getBmi()));
            writer.write("BMI Category : " + user.getBmiCategory() + "\n");
            writer.write(String.format("BMR : %.2f Calories/day%n", user.getBmr()));
            writer.write(String.format("TDEE : %.2f Calories/day%n", user.getTdee()));
            writer.write(String.format("Water Intake : %.2f Liters/day%n", user.getWaterIntake()));
            writer.write("\n");
            writer.write("\n=========================================\n\n");
            }
            writer.close();
            System.out.println("User data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
    public void readUserData() {
        try{
            FileReader fileReader = new FileReader("UserData.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error Reading File.");
        }
    }
}
