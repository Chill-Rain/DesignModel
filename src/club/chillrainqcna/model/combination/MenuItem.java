package club.chillrainqcna.model.combination;

/**
 * @author ChillRain 2023 02 12
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }
}
