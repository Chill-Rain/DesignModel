package club.chillrainqcna.principle.principle3.after;

/**
 * @author ChillRain 2023 01 29
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private HardDisk disk;
    public void run(){
        cpu.run();
        disk.getData();
        memory.run();
        disk.saveData("data");
        System.out.println("Computer is running.....");
    }
    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }
}
