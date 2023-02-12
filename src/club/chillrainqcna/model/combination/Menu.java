package club.chillrainqcna.model.combination;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ChillRain 2023 02 12
 */
public class Menu extends MenuComponent{
    private List<MenuComponent> list = new ArrayList<MenuComponent>();
    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        list.remove(component);
    }

    public Menu(String name, int level) {
        super(name, level);
    }

    @Override
    public MenuComponent getChild(int index) {
        return list.get(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < this.level; i++){
            System.out.print("--");
        }
        System.out.println(this.getName());
        for (MenuComponent menuComponent : list) {
            menuComponent.print();
        }
    }
}
