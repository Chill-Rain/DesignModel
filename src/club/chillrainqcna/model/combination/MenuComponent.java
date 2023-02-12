package club.chillrainqcna.model.combination;

/**
 * @author ChillRain 2023 02 12
 */
public abstract class MenuComponent {
    private String name;
    protected int level;

    public MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }
    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }
    public void print(){

    }
    public  String getName(){
        return this.name;
    }
}
