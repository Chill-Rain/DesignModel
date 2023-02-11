package club.chillrainqcna.model.facade;

/**
 * @author ChillRain 2023 02 11
 */
public class Client {
    public static void main(String[] args) {
        SmartManager manager = new SmartManager();
        manager.setSmart(new Light());
        manager.say("打开");
    }
}
