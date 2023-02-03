package club.chillrainqcna.model.model2.factoryMethod;



/**
 * @author ChillRain 2023 02 04
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addSuger();
        coffee.addMike();
        return coffee;
    }
}
