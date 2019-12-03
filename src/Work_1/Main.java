package Work_1;

import Work_1.Dishes.Bread;
import Work_1.Dishes.Meatball;
import Work_1.Dishes.Tea;
import Work_1.Ingredients.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addIngredient(new Salt());
        restaurant.addIngredient(new Flour());
        restaurant.addIngredient(new Meat());
        restaurant.addIngredient(new Lipton());
        restaurant.addIngredient(new Sugar());

        for (Ingredient ingredient : restaurant.ingredientList) {
            System.out.printf("В ресторане имеется %s в размере %d г.\n", ingredient, ingredient.getCount());
        }

        while ( (restaurant.ingredientList.get(0).getCount() > 0 && restaurant.ingredientList.get(1).getCount() > 0 && restaurant.ingredientList.get(4).getCount() > 0) ||
                (restaurant.ingredientList.get(0).getCount() > 0 && restaurant.ingredientList.get(2).getCount() > 0) ||
                (restaurant.ingredientList.get(3).getCount() > 0 && restaurant.ingredientList.get(4).getCount() > 0)) {
            restaurant.getDish(new Bread());
            restaurant.getDish(new Meatball());
            restaurant.getDish(new Tea());
        }

        System.out.println("");

        for (Map.Entry en : restaurant.dishes.entrySet()) {
            System.out.printf("Всего в ресторане приготовлено %d шт. %s.\n", (int) en.getValue(), en.getKey());
        }

        if (restaurant.dishes.containsKey("Хлеб") && restaurant.dishes.containsKey("Фрикаделька") && restaurant.dishes.containsKey("Чай")) {
            System.out.println("Ужин готов! Садитесь жрать, пожалуйста. \u00A9");
        }

        if (restaurant.dishes.isEmpty()) {
            System.out.println("К сожалению, ресторан ничего не приготовил :(");
        }


    }
}
