package reuseBetweenClasses;

/**
 * Created by ss on 2017/10/9.
 */
public class Orange extends Fruit {

    public Orange(int weight) {
        super(weight);
    }

    public void loseWater() {
        this.weight = this.weight / 3;
    }
}
