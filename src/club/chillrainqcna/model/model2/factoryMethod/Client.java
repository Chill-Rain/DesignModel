package club.chillrainqcna.model.model2.factoryMethod;


/**
 * @author ChillRain 2023 02 04
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(factory);
        System.out.println(coffeeStore.orderCoffee());
    }
}
