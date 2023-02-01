package club.chillrainqcna.model.model1.demo1;

/**
 * @author ChillRain 2023 02 01
 * 饿汉式：静态成员变量
 */
public class Singleton {
    //私有构造方法 因此外部类无法创建对象
    private Singleton(){

    }
    //通过静态成员变量创建自己的对象，在类被加载的时候就会被创建对象
    private static Singleton instance = new Singleton();
    //在通过一个方法对外提供获取对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
