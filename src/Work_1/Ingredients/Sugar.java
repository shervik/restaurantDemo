package Work_1.Ingredients;

public class Sugar implements Ingredient {
    private final String name = "Cахар";
    private int count = (int) (Math.random() * 150);

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
