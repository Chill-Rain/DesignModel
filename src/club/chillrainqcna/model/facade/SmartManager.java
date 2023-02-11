package club.chillrainqcna.model.facade;

/**
 * @author ChillRain 2023 02 11
 */
public class SmartManager {
    private Smart smart;

    public Smart getSmart() {
        return smart;
    }

    public void setSmart(Smart smart) {
        this.smart = smart;
    }
    public void say(String txt){
        if (txt.contains("打开")){
            smart.on();
        }else if (txt.contains("关闭")){
            smart.off();
        }
    }
}
