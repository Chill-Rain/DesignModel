package club.chillrainqcna.model.model1.demo5;

/**
 * @author ChillRain 2023 02 02
 * 静态内部类方式
 */
public class Singleton {
    private Singleton(){

    }
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
