package Work_1.Ingredients;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Meat implements Ingredient {
    private final String name = "Мясо";
    private int count = (int) (Math.random() * 160);

    private Logger log = LogManager.getLogger(name);

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
        log.debug("Установили количество: было {}, стало {}", this.count, count);
        this.count = count;
    }
}
