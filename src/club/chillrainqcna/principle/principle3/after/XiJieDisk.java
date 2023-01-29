package club.chillrainqcna.principle.principle3.after;

/**
 * @author ChillRain 2023 01 29
 */
public class XiJieDisk implements HardDisk {

    @Override
    public void saveData(String data) {
        System.out.println("save data....." + data);
    }

    @Override
    public String getData() {
        System.out.println("get data......");
        return "data";
    }
}
