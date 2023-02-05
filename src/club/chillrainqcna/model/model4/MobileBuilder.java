package club.chillrainqcna.model.model4;

/**
 * @author ChillRain 2023 02 05
 */
public class MobileBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("Mobile");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Mobile");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
