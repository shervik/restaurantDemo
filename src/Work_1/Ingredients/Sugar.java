package Work_1.Ingredients;

public class Sugar implements Ingredient {
    private final String name;
    private int count = (int) (Math.random() * 150);

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public Sugar() {
        this.name = "Сахар";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
