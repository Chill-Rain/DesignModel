package club.chillrainqcna.model.model4;

/**
 * @author ChillRain 2023 02 05
 */
public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("Ofo");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Ofo");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
