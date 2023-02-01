package club.chillrainqcna.model.model1.demo2;


/**
 * @author ChillRain 2023 02 01
 * 饿汉式：静态代码块
 */
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance; //此时对象为null
    //通过静态代码块创建对象 这种方法可以在创建对象之前进行其他操作
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
