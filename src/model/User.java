package model;

public class User {
    private int id;
    private String name;
    private int age;
    private String gender;

    private double height;
    private double weight;

    private String goal;
    private String fitnesslevel;
    private String equipment;
    private String activitylevel;

    private double bmi;
    private String bmiCategory;
    private double bmr;
    private double tdee;
    private double waterIntake;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getFitnesslevel() {
        return fitnesslevel;
    }

    public void setFitnesslevel(String fitnesslevel) {
        this.fitnesslevel = fitnesslevel;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getActivitylevel() {
        return activitylevel;
    }

    public void setActivitylevel(String activitylevel) {
        this.activitylevel = activitylevel;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBmiCategory() {
        return bmiCategory;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory = bmiCategory;
    }

    public double getBmr() {
        return bmr;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public double getTdee() {
        return tdee;
    }

    public void setTdee(double tdee) {
        this.tdee = tdee;
    }

    public double getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(double waterIntake) {
        this.waterIntake = waterIntake;
    }

    public User(){

    }
}
