package club.chillrainqcna.model.adapter.objectAdapter;

/**
 * @author ChillRain 2023 02 08
 */
public class SDCardImpl implements SDCard {

    @Override
    public String readSD() {
        String msg = "read data from SD";
        return msg;
    }

    @Override
    public void writeSD(String data) {
        System.out.println("write data to SD:" + data);
    }
}
