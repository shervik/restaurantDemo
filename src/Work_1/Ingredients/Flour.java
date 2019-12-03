package Work_1.Ingredients;

public class Flour implements Ingredient {
    private final String name;
    private int count = (int) (Math.random() * 200);

    public Flour() {
        this.name = "Мука";
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }
}
