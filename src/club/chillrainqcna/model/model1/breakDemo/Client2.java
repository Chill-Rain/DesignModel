package club.chillrainqcna.model.model1.breakDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ChillRain 2023 02 02
 * 反射破坏单例模式
 */
public class Client2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //通过字节码对象获取其无参构造方法
        Class singletonClass = Singleton.class;
        Constructor cons = singletonClass.getDeclaredConstructor();
        //其中的构造方法是私有的 直接跳过权限检查
        cons.setAccessible(true);
        Singleton s1 = (Singleton)cons.newInstance();
//        Field declaredFields = singletonClass.getDeclaredField("flag");
//        declaredFields.setAccessible(true);
//        declaredFields.setBoolean(s1, false);
        Singleton s2 = (Singleton)cons.newInstance();
        System.out.println(s1 == s2);
    }
}
