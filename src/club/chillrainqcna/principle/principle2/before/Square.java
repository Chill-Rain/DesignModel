package club.chillrainqcna.principle.principle2.before;

/**
 * @author ChillRain 2023 01 27
 */
public class Square implements Quadrilateral{

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLen1() {
        return side;
    }

    @Override
    public double getLen2() {
        return side;
    }

    @Override
    public double getLen3() {
        return side;
    }

    @Override
    public double getLen4() {
        return side;
    }
}
