package club.chillrainqcna.model.garnish;

/**
 * @author ChillRain 2023 02 10
 */
public class FireRice extends FastFood{

    public FireRice() {
        super("炒饭", 10);
    }

    @Override
    public int getCost() {
        return this.getPrice();
    }

    @Override
    public String getFoodName() {
        return this.getDesc();
    }
}
