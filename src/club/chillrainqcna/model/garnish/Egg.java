package club.chillrainqcna.model.garnish;

/**
 * @author ChillRain 2023 02 10
 */
public class Egg extends Garnish{

    public Egg(FastFood food) {
        super("鸡蛋", 1, food);
    }

    @Override
    public int getCost() {
        return this.getPrice() + super.getFood().getCost()  ;
    }

    @Override
    public String getFoodName() {
        return this.getDesc() + super.getFood().getFoodName();
    }
}
