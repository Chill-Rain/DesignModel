package club.chillrainqcna.model.adapter.classAdapter;

/**
 * @author ChillRain 2023 02 08
 */
public class Computer {
    private SDCard sdCard;

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public String readData(){
        if (sdCard == null){
            throw new RuntimeException("没有SD卡！");
        }
        return sdCard.readSD();
    }
    public void writeData(String msg){
        if (sdCard == null){
            throw new RuntimeException("没有SD卡！");
        }
        sdCard.writeSD(msg);
    }
}
