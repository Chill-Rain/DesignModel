package club.chillrainqcna.principle.principle2.before;

/**
 * @author ChillRain 2023 01 27
 */
public class Rectangle implements Quadrilateral{
    private double wigth;
    private double length;
    @Override
    public double getLen1() {
        return length;
    }

    @Override
    public double getLen2() {
        return length;
    }

    @Override
    public double getLen3() {
        return wigth;
    }

    public double getWigth() {
        return wigth;
    }

    public void setWigth(double wigth) {
        this.wigth = wigth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getLen4() {
        return wigth;
    }
}
