package club.chillrainqcna.model.bridge;

/**
 * @author ChillRain 2023 02 10
 */
public class Client {
    public static void main(String[] args) {
       OpratingSystem windows = new WindowsSystem();
       windows.setFile(new MP4File());
       windows.play("哼哼哼啊啊啊啊");
    }
}
