package club.chillrainqcna.model.garnish;

/**
 * @author ChillRain 2023 02 10
 */
public abstract class FastFood {
    private String desc;
    private int price;

    public FastFood(String desc, int price) {
        this.desc = desc;
        this.price = price;
    }
    public abstract int getCost();
    public abstract String getFoodName();
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
