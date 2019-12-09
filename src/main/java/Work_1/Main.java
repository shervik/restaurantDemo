package Work_1;

import Work_1.Ingredients.*;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addIngredient(new Salt());
        restaurant.addIngredient(new Flour());
        restaurant.addIngredient(new Meat());
        restaurant.addIngredient(new Lipton());
        restaurant.addIngredient(new Sugar());

        restaurant.toOrder();
    }
}
