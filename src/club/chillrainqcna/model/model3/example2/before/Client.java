package club.chillrainqcna.model.model3.example2.before;

/**
 * @author ChillRain 2023 02 05
 * 原型模式浅克隆的问题
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("田所浩二");
        citation.setStu(student);
        Citation citation1 = citation.clone();
        citation1.getStu().setName("我修院");
        System.out.println(citation.getStu().getName());
        System.out.println(citation1.getStu().getName());

    }
}
