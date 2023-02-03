package club.chillrainqcna.model.model2.simpleFactory.after;



/**
 * @author ChillRain 2023 02 04
 * 简单工厂
 */
public class SimpleCoffeeFactory {
    private SimpleCoffeeFactory(){

    }
    private static class GetFactory{
       private static SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
    }
    public static SimpleCoffeeFactory getInstance(){
        return GetFactory.simpleCoffeeFactory;
    }
    private SimpleCoffeeFactory readResolve(){
        return GetFactory.simpleCoffeeFactory;
    }
    public Coffee createCoffee(String coffeeName){
        Coffee coffee = null;
        if(coffeeName.equals("LettaCoffee")){
            coffee = new LettaCoffee();
        }else if (coffeeName.equals("AmericanCoffee")){
            coffee = new AmericanCoffee();
        }
        return coffee;
    }
}
