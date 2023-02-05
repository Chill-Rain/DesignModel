package club.chillrainqcna.model.model4;

/**
 * @author ChillRain 2023 02 05
 */
public class Client {
    public static void main(String[] args) {
        showBike(new MobileBuilder());
        showBike(new OfoBuilder());
    }
    private static void showBike(Builder builer){
        Director director = new Director(builer);
        Bike bike = director.construct();
        System.out.println(bike.getSeat());
        System.out.println(bike.getFrame());
    }
}
