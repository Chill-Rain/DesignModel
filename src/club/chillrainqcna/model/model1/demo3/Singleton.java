package club.chillrainqcna.model.model1.demo3;

/**
 * @author ChillRain 2023 02 01
 * 懒汉式
 */
public class Singleton {
    //私有化构造方法 使得外部无法访问
    private Singleton(){

    }
    private static Singleton instance;
    /*
        如果对象为空 那么就创建新对象， 如果不为空 则直接返回。这保证了只有在使用时才会创建对象，节约了内存
        但其中有一个问题，线程安全，可能两个线程同时执行， 然后创建了两个不同的对象
     */
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
