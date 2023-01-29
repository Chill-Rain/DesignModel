package club.chillrainqcna.principle.principle3.before;

/**
 * @author ChillRain 2023 01 29
 * 依赖倒转错误案例
 */
public class Test {
    public static void main(String[] args) {

        //创建机箱
        Computer computer = new Computer();
        //组装
        computer.setCpu(new IntelCPU());
        computer.setMemory(new KingStonMemory());
        computer.setXiJieDisk(new XiJieDisk());
        //开机
        computer.run();
        /*
        此电脑只能安装固定的配件，因为Computer中配件全是被定义好的，是依赖了具体对象，而非其抽象或者接口。
         */
    }
}
