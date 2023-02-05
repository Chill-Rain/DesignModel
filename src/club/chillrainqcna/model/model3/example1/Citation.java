package club.chillrainqcna.model.model3.example1;

/**
 * @author ChillRain 2023 02 05
 */
public class Citation implements Cloneable{
    public String name;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
    public void show(){
        System.out.println(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
