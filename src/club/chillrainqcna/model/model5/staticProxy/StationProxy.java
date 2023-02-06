package club.chillrainqcna.model.model5.staticProxy;

/**
 * @author ChillRain 2023 02 06
 */
public class StationProxy implements SellTicket{
    private TrainStation station = new TrainStation();
    @Override
    public void sellTicket() {
        System.out.println("代理商收费");
        station.sellTicket();
    }
}
