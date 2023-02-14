package club.chillrainqcna.model.template;

/**
 * @author ChillRain 2023 02 14
 */
public class ConcreateClass_Baocai extends AbstractClass{

    @Override
    protected void putVegetable() {
        System.out.println("放包菜");
    }

    @Override
    protected void putSauce() {
        System.out.println("放包菜的调料");
    }
}
