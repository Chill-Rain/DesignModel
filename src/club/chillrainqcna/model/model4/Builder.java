package club.chillrainqcna.model.model4;

/**
 * @author ChillRain 2023 02 05
 */
public abstract class Builder {
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
