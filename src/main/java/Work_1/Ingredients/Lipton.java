package Work_1.Ingredients;

public class Lipton implements Ingredient {
    private final String name = "Чай Липтон листовой";
    private int count = (int) (Math.random() * 5);

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
