package mealtracker;

import java.util.ArrayList;
import java.util.List;

public class MealTracker {
    private final List<Meal> meals = new ArrayList<Meal>();
    private final User user;

    MealTracker (User user){
        this.user = user;
    }

    boolean onTrack()
    {
        return this.getAdherence() >= this.user.getTargetAdherence();
    }

    double getAdherence() {
        int count = 0 ;

        for (Meal meal : this.meals) {
            if (meal.isComplete()){
                count += 1;
            }
        }
        return count / this.meals.size() * 100;
    }

    int getMealCount() {

        return this.meals.size();
    }

    void addMeal(Meal meal){

        this.meals.add(meal);
    }

    void viewMeals() {
        for (Meal meal : this.meals) {
            System.out.println(meal.getName());
        }
    }
}