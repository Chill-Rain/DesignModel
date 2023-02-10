package club.chillrainqcna.model.garnish;

/**
 * @author ChillRain 2023 02 10
 */
public class Client {
    public static void main(String[] args) {
        FireRice fireRice = new FireRice();
        System.out.println(fireRice.getFoodName());
        System.out.println(fireRice.getCost());
        FastFood food = new Egg(fireRice);
        System.out.println(food.getFoodName());
        System.out.println(food.getCost());
        food = new Egg(food);
        System.out.println(food.getFoodName());
        System.out.println(food.getCost());

    }
}
