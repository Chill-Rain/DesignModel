package club.chillrainqcna.model.flyweight;

/**
 * @author ChillRain 2023 02 13
 * 抽象享元
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void getMessage(String color){
        System.out.println(this.getShape() + " " + color);
    }
}
