package club.chillrainqcna.model.model3.example1;

/**
 * @author ChillRain 2023 02 05
 * 原型模式测试例
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = citation.clone();
        citation.setName("哼哼哼");
        citation1.setName("啊啊啊");
        citation.show();
        citation1.show();

    }
}
