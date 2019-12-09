package Work_1.Dishes;

import Work_1.Ingredients.Ingredient;
import Work_1.Ingredients.Lipton;
import Work_1.Ingredients.Sugar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Tea implements Dish {
    private final String name = "Чай";

    private Logger log = LogManager.getLogger();

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean setIngredient(List<Ingredient> ingredientList) {
        for (Ingredient ingredient : ingredientList) {
            if (ingredient instanceof Sugar) {
                int newCount = ingredient.getCount() - 25;
                if (newCount > 0) {
                    ingredient.setCount(newCount);
                } else {
                    log.warn("Закончился сахар");
                    ingredient.setCount(newCount);
                    return false;
                }
            }
            if (ingredient instanceof Lipton) {
                int newCount = ingredient.getCount() - 1;
                if (newCount > 0) {
                    ingredient.setCount(newCount);
                } else {
                    log.warn("Закончился Липтон");
                    ingredient.setCount(newCount);
                    return false;
                }
            }
        }
        return true;
    }
}
