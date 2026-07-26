package service;

public class DietRecommendation {
    public void recommendDiet(String goal, double tdee) {
        if(goal == null || goal.isEmpty()){
            System.out.println("Goal Not Found");
            return;
        }
        double recommendedCalories ;
        switch(goal){
            case "Weight Loss":
                recommendedCalories = tdee - 500;
                System.out.println("========== Weight Loss Diet Plan ==========");
                System.out.println();
                System.out.println("Goal : Weight Loss");
                System.out.println();
                System.out.println("Recommended Calories: " + recommendedCalories + " Calories/day");
                System.out.println();
                System.out.println("Breakfast:");
                System.out.println("- Oats");
                System.out.println("- Milk");
                System.out.println("- Apple");
                System.out.println();
                System.out.println("Lunch:");
                System.out.println("- 2 Chapati");
                System.out.println("- Dal");
                System.out.println("- Salad");
                System.out.println();
                System.out.println("Dinner:");
                System.out.println("- Paneer");
                System.out.println("- Vegetables");
                System.out.println("- Curd");
                System.out.println();
                System.out.println("Drink at least 2-3 liters of water daily.");
                System.out.println();
                System.out.println("Stay consistent and exercise regularly!");
                break;
            case "Weight Gain":
                recommendedCalories = tdee + 400;
                System.out.println("========== Weight Gain Diet Plan ==========");
                System.out.println();
                System.out.println("Recommended Calories:"  + recommendedCalories + " Calories/day");
                System.out.println();
                System.out.println("Breakfast:");
                System.out.println("- Peanut Butter Sandwich");
                System.out.println("- Milk");
                System.out.println("- Banana");
                System.out.println();
                System.out.println("Lunch:");
                System.out.println("- Rice");
                System.out.println("- Dal");
                System.out.println("- Paneer");
                System.out.println("- Curd");
                System.out.println();
                System.out.println("Dinner:");
                System.out.println("- 3 Chapati");
                System.out.println("- Mixed Vegetables");
                System.out.println("- Paneer");
                System.out.println();
                System.out.println("Snack:");
                System.out.println("- Dry Fruits");
                System.out.println("- Fruit Shake");
                System.out.println();
                System.out.println("Drink at least 2-3 liters of water daily.");
                System.out.println();
                System.out.println("Stay consistent and exercise regularly!");
                break;
            case "Muscle Gain":
                recommendedCalories = tdee + 250;
                System.out.println("========== Muscle Gain Diet Plan ==========");
                System.out.println();
                System.out.println("Recommended Calories:"  + recommendedCalories + " Calories/day");
                System.out.println("Eat 200-300 calories more than your TDEE with high protein.");
                System.out.println();
                System.out.println("Breakfast:");
                System.out.println("- Oats");
                System.out.println("- Milk");
                System.out.println("- Banana");
                System.out.println("- Peanut Butter");
                System.out.println();
                System.out.println("Lunch:");
                System.out.println("- Brown Rice");
                System.out.println("- Dal");
                System.out.println("- Paneer");
                System.out.println("- Salad");
                System.out.println();
                System.out.println("Dinner:");
                System.out.println("- Chapati");
                System.out.println("- Paneer");
                System.out.println("- Mixed Vegetables");
                System.out.println();
                System.out.println("Snack:");
                System.out.println("- Sprouts");
                System.out.println("- Dry Fruits");
                System.out.println();
                System.out.println("Exercise regularly and consume enough protein.");
                break;
            case "Maintain Weight":
                recommendedCalories = tdee ;
                System.out.println("========== Maintain Weight Diet Plan ==========");
                System.out.println();
                System.out.println("Recommended Calories:"  + recommendedCalories + " Calories/day");
                System.out.println("Eat calories equal to your TDEE.");
                System.out.println();
                System.out.println("Breakfast:");
                System.out.println("- Poha");
                System.out.println("- Milk");
                System.out.println("- Seasonal Fruit");
                System.out.println();
                System.out.println("Lunch:");
                System.out.println("- 2 Chapati");
                System.out.println("- Dal");
                System.out.println("- Vegetables");
                System.out.println("- Curd");
                System.out.println();
                System.out.println("Dinner:");
                System.out.println("- Chapati");
                System.out.println("- Paneer");
                System.out.println("- Salad");
                System.out.println();
                System.out.println("Stay active and drink plenty of water.");
                break;
            default :
                System.out.println("Invalid Goal");
        }
    }
}