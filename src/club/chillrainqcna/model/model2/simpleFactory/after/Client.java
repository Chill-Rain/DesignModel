package club.chillrainqcna.model.model2.simpleFactory.after;

/**
 * @author ChillRain 2023 02 04
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        System.out.println(coffeeStore.orderCoffee("LettaCoffee"));
    }
}
