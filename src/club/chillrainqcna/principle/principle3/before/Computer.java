package club.chillrainqcna.principle.principle3.before;

/**
 * @author ChillRain 2023 01 29
 */
public class Computer {
    private XiJieDisk xiJieDisk;
    private IntelCPU cpu;
    private KingStonMemory memory;
    public void run(){
        String data = xiJieDisk.getData();
        System.out.println("geted data is" + data);
        cpu.run();
        memory.runningMemory();
        System.out.println("computer is running!");
    }

    public XiJieDisk getXiJieDisk() {
        return xiJieDisk;
    }

    public void setXiJieDisk(XiJieDisk xiJieDisk) {
        this.xiJieDisk = xiJieDisk;
    }

    public IntelCPU getCpu() {
        return cpu;
    }

    public void setCpu(IntelCPU cpu) {
        this.cpu = cpu;
    }

    public KingStonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingStonMemory memory) {
        this.memory = memory;
    }
}
