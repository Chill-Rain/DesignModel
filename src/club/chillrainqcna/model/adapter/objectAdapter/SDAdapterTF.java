package club.chillrainqcna.model.adapter.objectAdapter;

/**
 * @author ChillRain 2023 02 08
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public TFCard getTfCard() {
        return tfCard;
    }

    public void setTfCard(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read data form tf");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String data) {
        System.out.println("adapter write data to tf");
        tfCard.writeTF(data);
    }
}
