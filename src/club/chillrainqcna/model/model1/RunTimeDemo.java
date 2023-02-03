package club.chillrainqcna.model.model1;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ChillRain 2023 02 02
 */
public class RunTimeDemo {
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Runtime runtime = Runtime.getRuntime();
        Process ipconfig = runtime.exec("ipconfig");
        InputStream inputStream = ipconfig.getInputStream();
        byte[] data = new byte[1024];
        int count = 0;
        while ((count = inputStream.read(data)) != -1){
            System.out.println(new String(data, 0,count, "GBK"));
    }
    }
}
