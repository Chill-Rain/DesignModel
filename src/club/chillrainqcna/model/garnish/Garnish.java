package club.chillrainqcna.model.garnish;

/**
 * @author ChillRain 2023 02 10
 */
public abstract class Garnish extends FastFood{
    //被装饰的对象
    private FastFood food;
    public Garnish(String desc, int price, FastFood food) {
        super(desc, price);
        this.food = food;
    }

    public FastFood getFood() {
        return food;
    }

    public void setFood(FastFood food) {
        this.food = food;
    }

    @Override
    public abstract int getCost();
}
