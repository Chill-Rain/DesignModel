package club.chillrainqcna.model.model2.abstractFactory;

/**
 * @author ChillRain 2023 02 04
 */
public class Client {
    public static void main(String[] args) {
        No1Factory no1Factory = new No1Factory();
        Coffee coffee = no1Factory.createCoffee();
        Dessert dessert = no1Factory.createDessert();
        coffee.show();
        dessert.show();
    }
}
