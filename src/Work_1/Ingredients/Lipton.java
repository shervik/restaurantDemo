package Work_1.Ingredients;

import Work_1.Ingredients.Ingredient;

public class Lipton implements Ingredient {
    private final String name;
    private int count = (int) (Math.random() * 5);

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public Lipton() {
        this.name = "Чай Липтон листовой";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
