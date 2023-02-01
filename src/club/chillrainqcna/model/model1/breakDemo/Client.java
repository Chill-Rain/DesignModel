package club.chillrainqcna.model.model1.breakDemo;

import java.io.*;

/**
 * @author ChillRain 2023 02 02
 * 通过序列化破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeObject2File();
        System.out.println(readObjectFromFile());
        System.out.println(readObjectFromFile());
    }
    //从文件中读取对象
    private static Singleton readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singletonObject"));
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();
        return singleton;
    }
    //写对象到文件
    private static void writeObject2File() throws IOException {
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonObject"));
        oos.writeObject(instance);
        oos.close();
    }
}
