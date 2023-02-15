package club.chillrainqcna.model.strategy;

/**
 * @author ChillRain 2023 02 15
 */
public class Client {
    public static void main(String[] args) {
        saleMan saleMan = new saleMan();
        saleMan.setStrategy(new StrategyA());
        saleMan.saling();
    }
}
