package club.chillrainqcna.model.model1.demo4;

/**
 * @author ChillRain 2023 02 01
 * 懒汉式 双重检查锁
 */
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    /*
        对于该方法 多数都是读操作 而读操作本身是线程安全的 没与必要让每一个线程都持有锁，这回影响性能
        因此 可以通过双重检查锁来让非读操作来持有锁，进而兼顾性能与安全
     */
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    //为什么不直接加在这里？因为加在这里，会有多个线程判断为null 导致多个对象的创建
                    instance = new Singleton();
                    System.out.println("create!");
                }
                System.out.println("created!");
            }
            System.out.println("created!");
        }
        return instance;
    }
}
