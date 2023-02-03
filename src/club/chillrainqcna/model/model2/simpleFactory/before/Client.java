package club.chillrainqcna.model.model2.simpleFactory.before;

/**
 * @author ChillRain 2023 02 04
 * 点咖啡案例
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        System.out.println(coffeeStore.orderCoffee("AmericanCoffee"));
    }
}
