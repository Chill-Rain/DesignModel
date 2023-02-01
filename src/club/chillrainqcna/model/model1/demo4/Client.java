package club.chillrainqcna.model.model1.demo4;

/**
 * @author ChillRain 2023 02 02
 */
public class Client {
    public static void main(String[] args) {

            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();

    }
}
