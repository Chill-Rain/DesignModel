package club.chillrainqcna.model.model2.simpleFactory.before;

/**
 * @author ChillRain 2023 02 03
 */
public class CoffeeStore {
    public Coffee orderCoffee(String coffeeName){
        Coffee coffee = null;
        if(coffeeName.equals("LettaCoffee")){
            coffee = new LettaCoffee();
        }else if (coffeeName.equals("AmericanCoffee")){
            coffee = new AmericanCoffee();
        }
        coffee.addMike();
        coffee.addSugar();
        return coffee;
    }
}
