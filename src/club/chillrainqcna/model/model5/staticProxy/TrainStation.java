package club.chillrainqcna.model.model5.staticProxy;

/**
 * @author ChillRain 2023 02 06
 */
public class TrainStation implements SellTicket{

    @Override
    public void sellTicket() {

        System.out.println("火车站卖票");
    }
}
