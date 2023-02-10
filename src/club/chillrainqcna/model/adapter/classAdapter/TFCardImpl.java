package club.chillrainqcna.model.adapter.classAdapter;

/**
 * @author ChillRain 2023 02 08
 */
public class TFCardImpl implements TFCard{

    @Override
    public String readTF() {
        return "read data from TF!";
    }

    @Override
    public void writeTF(String data) {
        System.out.println("write data to TF:" +data);
    }
}
