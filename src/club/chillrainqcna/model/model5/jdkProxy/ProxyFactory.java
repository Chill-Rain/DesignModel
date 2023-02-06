package club.chillrainqcna.model.model5.jdkProxy;

import club.chillrainqcna.model.model5.staticProxy.SellTicket;
import club.chillrainqcna.model.model5.staticProxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ChillRain 2023 02 06
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation trainStation = new TrainStation();
    public SellTicket getProxyObject(){
        //目标对象的类加载器 目标对象的接口 代理方法
        SellTicket proxy = (SellTicket) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("通过JDK动态代理");
                        Object obj = method.invoke(trainStation);
                        return obj;
                    }
                });
        return proxy;
    }
}
