package mealtracker;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class Meal {
    private String name;
    private List<Food> foods;
    private LocalDateTime mealtime;

    Meal(String name, List<Food> foods, LocalDateTime mealtime){
        this.name= name;
        this.foods= foods;
        this.mealtime= mealtime;
    }

    double getCalories(){
        double calories = 0;

        for (Food food : this.foods){
            calories += food.getCalories();
        }

        return calories;
    }

    double getFat() {
        double fat = 0;

        for (Food food : this.foods) {
            fat += food.getFat();
        }

        return fat;
    }

    double getCarbohydrates() {
        double carbs = 0;

        for (Food food : this.foods) {
            carbs += food.getCarbohydrates();
        }
        return carbs;
    }

    double getProtein() {
        double protein = 0;

        for (Food food : this.foods){
            protein += food.getProtein();
        }

        return protein;
    }

    String getName() {

        return this.name;
    }

    LocalDateTime getMealTime() {
        return mealtime;
    }

    void viewFoods() {
        for (Food food : this.foods){
            System.out.println(food.getName());
        }
    }

    boolean isComplete() {
        boolean hasFat = false, hasProtein = false,hasFruits = false,hasVeggie = false;

        for (Food food : this.foods){
            Set<Category> categories = food.getCategories();
            if (categories.contains(Category.Fat)) {
                hasFat = true;
            }
            if (categories.contains(Category.Protein)) {
                hasProtein = true;
            }
            if (categories.contains(Category.Fruit)) {
                hasFruits = true;
            }
            if (categories.contains(Category.Vegetable)) {
                hasVeggie = true;
            }
        }

        return hasFat && hasFruits && hasProtein && hasVeggie;
    }
}