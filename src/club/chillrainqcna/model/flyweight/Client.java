package club.chillrainqcna.model.flyweight;

/**
 * @author ChillRain 2023 02 13
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory factory = BoxFactory.getInstance();
        factory.getShape("O").getMessage("blue");
        factory.getShape("O").getMessage("red");
        factory.getShape("L").getMessage("red");


    }
}
