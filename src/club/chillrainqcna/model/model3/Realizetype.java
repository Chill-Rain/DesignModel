package club.chillrainqcna.model.model3;

/**
 * @author ChillRain 2023 02 05
 */
public class Realizetype implements Cloneable{
    public Realizetype(){
        System.out.println("原型对象创建完成");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("克隆完成");
        return (Realizetype) super.clone();
    }
}

