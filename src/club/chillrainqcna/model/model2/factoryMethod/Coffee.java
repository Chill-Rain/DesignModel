package club.chillrainqcna.model.model2.factoryMethod;

/**
 * @author ChillRain 2023 02 04
 */
public abstract class Coffee {
    public abstract String getCoffeeName();
    public void addSuger(){
        System.out.println("addSuger======");
    }
    public void addMike(){
        System.out.println("addMike======");
    }
}
