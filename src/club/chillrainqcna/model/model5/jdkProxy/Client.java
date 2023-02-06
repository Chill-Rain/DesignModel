package club.chillrainqcna.model.model5.jdkProxy;

import club.chillrainqcna.model.model5.staticProxy.SellTicket;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ChillRain 2023 02 06
 */
public class Client {
    public static void main(String[] args) throws IOException {
        SellTicket proxyObject = new ProxyFactory().getProxyObject();
        proxyObject.sellTicket();
        getProxyClass(proxyObject);
    }
    public static void getProxyClass(Object obj) throws IOException {
        FileOutputStream out = null;
        try {
            byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", obj.getClass().getInterfaces());
            out = new FileOutputStream("ProxyClass.class");
            out.write(classFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            out.close();
        }
    }
}
