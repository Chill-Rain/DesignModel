package club.chillrainqcna.model.model2.simpleFactory.after;

/**
 * @author ChillRain 2023 02 04
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = SimpleCoffeeFactory.getInstance();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
