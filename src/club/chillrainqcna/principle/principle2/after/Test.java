package club.chillrainqcna.principle.principle2.after;

/**
 * @author ChillRain 2023 01 27
 */
public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setLength(20);
        //rectangle.setWigth(40);
        resize(rectangle);

    }
    public static void resize(Rectangle r){
        while(r.getLength() <= r.getWigth()){
            r.setLength(r.getLength() + 1);
            System.out.println("======================");
            System.out.println(r.getWigth());
            System.out.println(r.getLength());
        }
    }
}
