package club.chillrainqcna.model.facade;

/**
 * @author ChillRain 2023 02 11
 */
public class AirCondition extends Smart{

    @Override
    public void on() {
        System.out.println("Open AirCondition");
    }

    @Override
    public void off() {
        System.out.println("Close Aircondition");
    }
}
