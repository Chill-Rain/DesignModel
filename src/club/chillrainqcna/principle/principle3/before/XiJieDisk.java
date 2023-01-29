package club.chillrainqcna.principle.principle3.before;

/**
 * @author ChillRain 2023 01 29
 */
public class XiJieDisk {
    public void saveData(String data){
        System.out.println("存储......" + data);
    }
    public String getData(){
        System.out.println("获取......");
        return "data";
    }
}
