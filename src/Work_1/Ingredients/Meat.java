package Work_1.Ingredients;

public class Meat implements Ingredient {
    private final String name;
    private int count = (int) (Math.random() * 160);

    public Meat() {
        this.name = "Мясо";
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
