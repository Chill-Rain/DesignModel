package club.chillrainqcna.model.adapter.objectAdapter;

/**
 * @author ChillRain 2023 02 08
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setSdCard(new SDAdapterTF());
        System.out.println(computer.readData());
        computer.writeData("哼哼哼啊啊啊");
        System.out.println("======================");
        computer.setSdCard(new SDCardImpl());
        System.out.println(computer.readData());
        computer.writeData("哼哼哼啊啊啊");
    }
}
