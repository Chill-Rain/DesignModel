package club.chillrainqcna.model.flyweight;

import java.util.HashMap;

/**
 * @author ChillRain 2023 02 13
 * 享元工厂
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;
    private BoxFactory(){
        map = new HashMap<>();
        map.put("O",new OBox());
        map.put("L",new LBox());
        map.put("I",new IBox());
    }
    public AbstractBox getShape(String name){
        return map.get(name);
    }
    public static class FactoryHolder{
        private static BoxFactory factory = new BoxFactory();
    }
    public static BoxFactory getInstance(){
        return FactoryHolder.factory;
    }
}
