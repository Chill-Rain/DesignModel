package club.chillrainqcna.model.model2.factoryMethod;

/**
 * @author ChillRain 2023 02 04
 */
public class LettaCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LettaCoffee();
    }
}
