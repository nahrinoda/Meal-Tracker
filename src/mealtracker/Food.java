package mealtracker;

import java.util.Set;

public class Food {
    private double fat;
    private double carbohydrates;
    private double protein;
    private String name;
    private Set<Category> categories;

    Food(String name, double carbs, double fat, double protein, Set<Category> categories)
    {
        this.name = name;
        this.categories = categories;
        this.carbohydrates = carbs;
        this.fat = fat;
        this.protein = protein;
    }

    double getCalories()
    {
        return (9 * this.fat) + (4 * this.carbohydrates) + (4 * this.protein);
    }

    double getCarbohydrates(){

        return this.carbohydrates;
    }

    Set<Category> getCategories(){

        return this.categories;
    }

    double getFat(){

        return this.fat;
    }

    double getProtein(){

        return this.protein;
    }

    String getName(){

        return this.name;
    }

    void addCategory(Category category)
    {
        this.categories.add(category);
    }
}