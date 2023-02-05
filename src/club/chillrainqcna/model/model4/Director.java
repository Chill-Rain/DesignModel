package club.chillrainqcna.model.model4;

/**
 * @author ChillRain 2023 02 05
 */
public class Director {
    public Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
