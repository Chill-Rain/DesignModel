package club.chillrainqcna.principle.principle3.after;

/**
 * @author ChillRain 2023 01 29
 * 依赖倒转遵循
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new AmdCPU());
        computer.setDisk(new XiJieDisk());
        computer.setMemory(new KingStonMemory());
        computer.run();
    }
}
