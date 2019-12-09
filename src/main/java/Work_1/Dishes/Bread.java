package Work_1.Dishes;

import Work_1.Ingredients.Flour;
import Work_1.Ingredients.Ingredient;
import Work_1.Ingredients.Salt;
import Work_1.Ingredients.Sugar;

import java.util.List;

public class Bread implements Dish {
    private final String name = "Хлеб";

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean setIngredient(List<Ingredient> ingredientList) {
        for (Ingredient ingredient : ingredientList) {
            if (ingredient instanceof Flour) {
                int newCount = ingredient.getCount() - 50;
                if (newCount >= 0) {
                    ingredient.setCount(newCount);
                } else {
                    ingredient.setCount(newCount);
                    return false;
                }
            }

            if (ingredient instanceof Salt) {
                int newCount = ingredient.getCount() - 20;
                if (newCount >= 0) {
                    ingredient.setCount(newCount);
                } else {
                    ingredient.setCount(newCount);
                    return false;
                }
            }
        }
        return true;
    }
}
