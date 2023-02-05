package club.chillrainqcna.model.model3.example2.after;

import java.io.*;

/**
 * @author ChillRain 2023 02 05
 * 原型模式浅克隆的问题
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("田所浩二");
        citation.setStu(student);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"));
        oos.writeObject(citation);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj"));
        Citation citation1 = (Citation) ois.readObject();
        citation1.clone();
        citation1.getStu().setName("我修院");
        System.out.println(citation.getStu().getName());
        System.out.println(citation1.getStu().getName());

    }
}
