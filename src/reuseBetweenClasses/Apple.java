package reuseBetweenClasses;

/**
 * Created by ss on 2017/10/9.
 */
public class Apple extends Fruit {

    public Apple(int weight) {
        super(weight);
    }

    public void loseWater() {
        this.weight = this.weight / 2;
    }
}
