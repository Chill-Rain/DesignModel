package club.chillrainqcna.model.model1.demo1;

/**
 * @author ChillRain 2023 02 01
 * 测试
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}
