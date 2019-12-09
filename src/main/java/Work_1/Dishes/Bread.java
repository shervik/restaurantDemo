package Work_1.Dishes;

import Work_1.Ingredients.Flour;
import Work_1.Ingredients.Ingredient;
import Work_1.Ingredients.Salt;
import Work_1.Ingredients.Sugar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Bread implements Dish {
    private final String name = "Хлеб";

    private Logger log = LogManager.getLogger();

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
                    log.warn("Закончилась мука");
                    ingredient.setCount(newCount);
                    return false;
                }
            }

            if (ingredient instanceof Salt) {
                int newCount = ingredient.getCount() - 20;
                if (newCount >= 0) {
                    ingredient.setCount(newCount);
                } else {
                    log.warn("Закончилась соль");
                    ingredient.setCount(newCount);
                    return false;
                }
            }
        }
        return true;
    }
}
