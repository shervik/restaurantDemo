package Work_1;

import Work_1.Dishes.Bread;
import Work_1.Dishes.Dish;
import Work_1.Dishes.Meatball;
import Work_1.Dishes.Tea;
import Work_1.Ingredients.Ingredient;

import java.util.*;

public class Restaurant {
    Map<String, Integer> dishes = new HashMap<>();
    List<Ingredient> ingredientList = new LinkedList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    public Map<String, Integer> getDish(Dish name) {
        if (name.setIngredient(ingredientList)) {
            if (dishes.containsKey(name.toString())) {
                dishes.put(name.toString(), dishes.get(name.toString()) + 1);
            } else {
                dishes.put(name.toString(), 1);
            }
        }
        return dishes;
    }

    public void allIng() {
        for (Ingredient ingredient : ingredientList) {
            System.out.printf("В ресторане имеется %s в размере %d г.\n", ingredient, ingredient.getCount());
        }
    }

    public void toOrder() {
        allIng();

        while ((ingredientList.get(0).getCount() > 0 && ingredientList.get(1).getCount() > 0) || (ingredientList.get(0).getCount() > 0 && ingredientList.get(2).getCount() > 0) || (ingredientList.get(3).getCount() > 0 && ingredientList.get(4).getCount() > 0)) {
            getDish(new Bread());
            getDish(new Meatball());
            getDish(new Tea());
        }

        System.out.println();

        call();
    }

    private void call() {
        dishes.forEach((key, value) -> System.out.printf("Всего в ресторане приготовлено %d шт. %s.\n", value, key));

        if (dishes.containsKey("Хлеб") && dishes.containsKey("Фрикаделька") && dishes.containsKey("Чай")) {
            System.out.println("Ужин готов! Садитесь жрать, пожалуйста. \u00A9");
        }

        if (dishes.isEmpty()) {
            System.out.println("К сожалению, ресторан ничего не приготовил :(");
        }
    }


}
