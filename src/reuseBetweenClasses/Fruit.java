package reuseBetweenClasses;

/**
 * Created by ss on 2017/10/9.
 */
public abstract class Fruit {

    protected int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    abstract void loseWater();
}
