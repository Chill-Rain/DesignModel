package club.chillrainqcna.model.facade;

/**
 * @author ChillRain 2023 02 11
 */
public class Light extends Smart{

    @Override
    public void on() {
        System.out.println("Open Light");
    }

    @Override
    public void off() {
        System.out.println("Close Light");
    }
}
