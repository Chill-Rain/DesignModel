package club.chillrainqcna.model.model4.example;

/**
 * @author ChillRain 2023 02 06
 * 产品和建造器结合 实现链式编程
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("Kirin")
                .disk("XiJie")
                .screen("Samsung")
                .memory("Kingston")
                .mainBoard("Asus")
                .build();
        System.out.println(phone);
    }
}
