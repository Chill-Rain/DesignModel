package club.chillrainqcna.model.model2.configFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author ChillRain 2023 02 05
 * 工厂 + 配置文件
 */
public class ConfigFactory {
    //1 创建容器用于存储对象
    private static HashMap<String, Object> map = new HashMap();
    //2 加载配置文件并将对象存储到容器中
    //2.1要通过类加载器来获取输入流！
    static{
        Properties properties = new Properties();
        InputStream beans = ConfigFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(beans);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                //获取全限定类名
                String className = properties.getProperty((String) key);
                //通过反射去创建对象
                Class clazz = Class.forName(className);
                Coffee instance = (Coffee) clazz.newInstance();
                map.put((String)key, instance);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public Coffee getCoffee(String key){
        return (Coffee)map.get(key);
    }
}
