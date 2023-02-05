package club.chillrainqcna.model.model2.abstractFactory;

/**
 * @author ChillRain 2023 02 04
 */
public class No1Factory implements AbstractFactory{

    @Override
    public Coffee createCoffee() {
        return new LettaCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
