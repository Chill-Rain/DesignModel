package club.chillrainqcna.principle.principle2.before;



/**
 * @author ChillRain 2023 01 27
 */
public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWigth(40);
        resize(rectangle);

    }
    public static void resize(Rectangle r){
        while(r.getLen1() <= r.getLen3()){
            r.setLength(r.getLen1() + 1);
            System.out.println("======================");
            System.out.println(r.getLen1());
            System.out.println(r.getLen3());
        }
    }
}
