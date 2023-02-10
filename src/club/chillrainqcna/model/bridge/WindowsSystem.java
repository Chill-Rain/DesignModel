package club.chillrainqcna.model.bridge;

/**
 * @author ChillRain 2023 02 10
 * 扩展抽象化
 */
public class WindowsSystem extends OpratingSystem{

    @Override
    public void play(String name) {
        this.getFile().decode(name);
    }
}
