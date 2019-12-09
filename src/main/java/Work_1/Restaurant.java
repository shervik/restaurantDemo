package Work_1;

import Work_1.Dishes.Bread;
import Work_1.Dishes.Dish;
import Work_1.Dishes.Meatball;
import Work_1.Dishes.Tea;
import Work_1.Ingredients.Ingredient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Restaurant {
    private Logger log = LogManager.getLogger("Ресторан");

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
            log.info("В ресторане имеется {} в размере {} г.\n", ingredient, ingredient.getCount());
        }
    }

    public void toOrder() {
        allIng();

        while ((ingredientList.get(0).getCount() > 0 && ingredientList.get(1).getCount() > 0) || (ingredientList.get(0).getCount() > 0 && ingredientList.get(2).getCount() > 0) || (ingredientList.get(3).getCount() > 0 && ingredientList.get(4).getCount() > 0)) {
            log.trace("Пытаемся готовить хлеб.");
            getDish(new Bread());
            log.trace("Пытаемся готовить фрикадельки.");
            getDish(new Meatball());
            log.trace("Пытаемся готовить чай.");
            getDish(new Tea());
        }

        log.info("Игредиенты закончились :(");

        call();
    }

    private void call() {
        dishes.forEach((key, value) -> log.info("Всего в ресторане приготовлено {} шт. {}.\n", value, key));

        if (dishes.containsKey("Хлеб") && dishes.containsKey("Фрикаделька") && dishes.containsKey("Чай")) {
            log.info("Ужин готов! Садитесь жрать, пожалуйста. \u00A9");
        }

        if (dishes.isEmpty()) {
            log.error("К сожалению, ресторан ничего не приготовил :(");
        }
    }


}
