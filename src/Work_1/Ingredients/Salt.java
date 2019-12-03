package Work_1.Ingredients;

public class Salt implements Ingredient {
    private final String name;
    private int count = (int) (Math.random() * 220);

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public Salt() {
        this.name = "Соль";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
