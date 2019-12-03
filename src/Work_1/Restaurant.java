package Work_1;

import Work_1.Dishes.Dish;
import Work_1.Ingredients.Ingredient;

import java.util.*;

public class Restaurant {

    Map<String, Integer> dishes = new HashMap();
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
}
