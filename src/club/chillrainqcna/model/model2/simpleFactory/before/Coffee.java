package club.chillrainqcna.model.model2.simpleFactory.before;

/**
 * @author ChillRain 2023 02 03
 */
public abstract class Coffee {
    public abstract String getCoffeeName();
    public void addMike(){
        System.out.println("addMike-----");
    }
    public void addSugar(){
        System.out.println("addSugar-----");
    }
}
