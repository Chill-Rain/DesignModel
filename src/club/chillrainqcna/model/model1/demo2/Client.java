package club.chillrainqcna.model.model1.demo2;

import club.chillrainqcna.model.model1.demo2.Singleton;

/**
 * @author ChillRain 2023 02 01
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance =Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
