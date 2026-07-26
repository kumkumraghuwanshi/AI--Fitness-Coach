package service;

public class WorkoutSchedule {
    public void showWorkoutSchedule(String goal, String fitnesslevel, String equipment){
        if (goal == null || goal.isEmpty()) {
            System.out.println("Goal not found.");
            return;
        }

        if (fitnesslevel == null || fitnesslevel.isEmpty()) {
            System.out.println("Fitness Level not found.");
            return;
        }

        if (equipment == null || equipment.isEmpty()) {
            System.out.println("Equipment not found.");
            return;
        }
        System.out.println("========== Weekly Workout  Schedule ==========");
        switch (goal){
            case "Weight Loss":
                switch (fitnesslevel){
                    case "Beginner":
                        System.out.println("====== Beginner (3–4 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Full Body Workout + Cardio");
                        System.out.println("Tuesday — Rest / Light Walking");
                        System.out.println("Wednesday — Full Body Workout + Cardio");
                        System.out.println("Thursday — Rest / Stretching");
                        System.out.println("Friday — Full Body Workout + Cardio");
                        System.out.println("Saturday — Light Cardio (Walking/Cycling)");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Intermediate":
                        System.out.println("====== Intermediate (4–5 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Upper Body + Cardio");
                        System.out.println("Tuesday — Lower Body + Cardio");
                        System.out.println("Wednesday — Core + HIIT");
                        System.out.println("Thursday — Rest / Mobility");
                        System.out.println("Friday — Full Body + Cardio");
                        System.out.println("Saturday — HIIT + Core");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Advanced":
                        System.out.println("====== Advanced (5–6 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Chest + Triceps + HIIT");
                        System.out.println("Tuesday — Back + Biceps + Cardio");
                        System.out.println("Wednesday — Legs + Core");
                        System.out.println("Thursday — Shoulders + HIIT");
                        System.out.println("Friday — Full Body Circuit");
                        System.out.println("Saturday — HIIT + Abs)");
                        System.out.println("Sunday — Rest");
                        break;
                    default :
                        System.out.println("Invalid Fitness Level");
                }
                break;
            case "Weight Gain":
                switch (fitnesslevel){
                    case "Beginner":
                        System.out.println("====== Beginner (3 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Full Body");
                        System.out.println("Tuesday — Rest");
                        System.out.println("Wednesday — Full Body");
                        System.out.println("Thursday — Rest");
                        System.out.println("Friday — Full Body");
                        System.out.println("Saturday — Light Walking)");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Intermediate":
                        System.out.println("====== Intermediate (4 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Chest + Triceps");
                        System.out.println("Tuesday — Back + Biceps");
                        System.out.println("Wednesday — Rest");
                        System.out.println("Thursday — Legs + Core");
                        System.out.println("Friday — Shoulders + Arms");
                        System.out.println("Saturday — Light Walking");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Advanced":
                        System.out.println("====== Advanced (5–6 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Chest");
                        System.out.println("Tuesday — Back");
                        System.out.println("Wednesday — Legs");
                        System.out.println("Thursday — Shoulders");
                        System.out.println("Friday — Arms");
                        System.out.println("Saturday — Full Body / Weak Muscle Group)");
                        System.out.println("Sunday — Rest");
                        break;
                    default :
                        System.out.println("Invalid Fitness Level");
                }
                break;
            case "Muscle Gain":
                switch (fitnesslevel){
                    case "Beginner":
                        System.out.println("====== Beginner (3 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Full Body");
                        System.out.println("Tuesday — Rest");
                        System.out.println("Wednesday — Full Body");
                        System.out.println("Thursday — Rest");
                        System.out.println("Friday — Full Body");
                        System.out.println("Saturday — Mobility / Stretching");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Intermediate":
                        System.out.println("====== Intermediate (5 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Chest + Triceps");
                        System.out.println("Tuesday — Back + Biceps");
                        System.out.println("Wednesday — Legs");
                        System.out.println("Thursday — Rest");
                        System.out.println("Friday — Shoulders + Core");
                        System.out.println("Saturday — Arms + Abs)");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Advanced":
                        System.out.println("====== Advanced (6 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Chest");
                        System.out.println("Tuesday — Back");
                        System.out.println("Wednesday — Legs");
                        System.out.println("Thursday — Shoulders");
                        System.out.println("Friday — Arms");
                        System.out.println("Saturday — Core + Weak Muscle Group)");
                        System.out.println("Sunday — Rest");
                        break;
                    default :
                        System.out.println("Invalid Fitness Level");
                }
                break;
            case "Maintain Weight":
                switch (fitnesslevel){
                    case "Beginner":
                        System.out.println("====== Beginner (3–4 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Full Body");
                        System.out.println("Tuesday — Walking");
                        System.out.println("Wednesday — Full Body");
                        System.out.println("Thursday — Yoga / Stretching");
                        System.out.println("Friday — Full Body");
                        System.out.println("Saturday — Cycling / Walking");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Intermediate":
                        System.out.println("====== Intermediate (4–5 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Upper Body");
                        System.out.println("Tuesday — Lower Body");
                        System.out.println("Wednesday — Core + Cardio");
                        System.out.println("Thursday — Rest");
                        System.out.println("Friday — Full Body");
                        System.out.println("Saturday — Cycling / Jogging)");
                        System.out.println("Sunday — Rest");
                        break;
                    case "Advanced":
                        System.out.println("====== Advanced (5–6 Days/Week) ======");
                        System.out.println();
                        System.out.println("Monday — Chest + Triceps");
                        System.out.println("Tuesday — Back + Biceps");
                        System.out.println("Wednesday — Legs");
                        System.out.println("Thursday — Shoulders");
                        System.out.println("Friday — Full Body");
                        System.out.println("Saturday — Cardio + Core)");
                        System.out.println("Sunday — Rest");
                        break;
                    default :
                        System.out.println("Invalid Fitness Level");
                }
                break;
            default :
                System.out.println("Invalid Goal");
        }
    }
}
