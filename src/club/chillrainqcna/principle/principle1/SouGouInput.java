package club.chillrainqcna.principle.principle1;

/**
 * @author ChillRain 2023 01 27
 */
public class SouGouInput {
    private AbstractSkin skin;
    public void setSkin(AbstractSkin skin){
        this.skin = skin;
    }
    public void display(){
        skin.display();
    }
}
