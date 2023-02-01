package club.chillrainqcna.model.model1.breakDemo;

import java.io.Serializable;

/**
 * @author ChillRain 2023 02 02
 * 静态内部类方式
 */
public class Singleton implements Serializable {
    private static boolean flag = false;
    private Singleton(){
//        if(flag){
//            throw new RuntimeException("非法行为，试图创建多个对象");
//        }
//        flag = true;
        if(SingletonHolder.instance != null){
            throw new RuntimeException("非法行为，试图创建多个对象");
        }
    }
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
    public Object readResolve(){
        return SingletonHolder.instance;
    }
}
