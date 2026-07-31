package service;
import model.User;
public class ProfileService {
    public void viewProfile(User user){
        System.out.println("======== User Profile ========");
        System.out.println("User ID : " + user.getId());
        System.out.println("Name : " + user.getName());
        System.out.println("Age : " + user.getAge());
        System.out.println("Gender : " + user.getGender());
        System.out.println("Height : " + user.getHeight());
        System.out.println("Weight : " + user.getWeight());
        System.out.println("Goal : " + user.getGoal());
        System.out.println("Fitness Level : " + user.getFitnesslevel());
        System.out.println("Equipment : " + user.getEquipment());
        System.out.println("Activity Level : " + user.getActivitylevel());
    }
}
