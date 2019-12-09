package Work_1.Ingredients;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sugar implements Ingredient {
    private final String name = "Cахар";
    private int count = (int) (Math.random() * 150);

    private Logger log = LogManager.getLogger(name);

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void setCount(int count) {
        log.debug("Установили количество: было {}, стало {}", this.count, count);
        this.count = count;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
