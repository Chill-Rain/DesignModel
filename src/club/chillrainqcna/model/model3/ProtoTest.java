package club.chillrainqcna.model.model3;

/**
 * @author ChillRain 2023 02 05
 */
public class ProtoTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = realizetype.clone();
        System.out.println(clone == realizetype);
    }
}
