package club.chillrainqcna.model.command;

/**
 * @author ChillRain 2023 02 15
 * 请求者
 */
public class Waitor {
    private Command cmd;

    public void setCmd(Command cmd) {
        this.cmd = cmd;
    }
    public void orderUp(){
        cmd.excute();
    }
}
