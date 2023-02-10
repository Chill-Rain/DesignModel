package club.chillrainqcna.model.bridge;

/**
 * @author ChillRain 2023 02 10
 */
public class MACSystem extends OpratingSystem{

    @Override
    public void play(String name) {
        this.getFile().decode(name);
    }
}
