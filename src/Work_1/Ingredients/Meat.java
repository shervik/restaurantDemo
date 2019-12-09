package Work_1.Ingredients;

public class Meat implements Ingredient {
    private final String name = "Мясо";
    private int count = (int) (Math.random() * 160);

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
