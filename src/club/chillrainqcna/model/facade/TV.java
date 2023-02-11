package club.chillrainqcna.model.facade;

/**
 * @author ChillRain 2023 02 11
 */
public class TV extends Smart{

    @Override
    public void on() {
        System.out.println("Open TV");
    }

    @Override
    public void off() {
        System.out.println("Close TV");
    }
}
