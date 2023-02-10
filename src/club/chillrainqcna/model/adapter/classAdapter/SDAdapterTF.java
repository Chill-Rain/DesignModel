package club.chillrainqcna.model.adapter.classAdapter;

/**
 * @author ChillRain 2023 02 08
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read data form tf");
        return readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write data to tf");
        writeTF(data);
    }
}
