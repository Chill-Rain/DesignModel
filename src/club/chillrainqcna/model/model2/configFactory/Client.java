package club.chillrainqcna.model.model2.configFactory;

/**
 * @author ChillRain 2023 02 05
 */
public class Client {
    public static void main(String[] args) {
        ConfigFactory configFactory = new ConfigFactory();
        Coffee americancoffee = configFactory.getCoffee("americancoffee");
        System.out.println(americancoffee);
    }
}
