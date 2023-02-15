package club.chillrainqcna.model.strategy;

/**
 * @author ChillRain 2023 02 15
 */
public class saleMan {
    public Strategy strategy;
    public void saling(){
        this.strategy.doing();
    }
    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
