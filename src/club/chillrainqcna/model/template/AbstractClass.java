package club.chillrainqcna.model.template;

/**
 * @author ChillRain 2023 02 14
 */
public abstract class AbstractClass {
    public void cook(){
        this.putOil();
        this.heatOil();
        this.putVegetable();
        this.putSauce();
        this.fry();
    }
    private void putOil(){
        System.out.println("放油");
    }
    private void heatOil(){
        System.out.println("热油");
    }
    protected abstract void putVegetable();
    protected abstract void putSauce();
    private void fry(){
        System.out.println("开焯");
    }
}
