package club.chillrainqcna.principle.principle2.after;

/**
 * @author ChillRain 2023 01 27
 */
public class Square extends Rectangle{
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWigth(length);
    }

    @Override
    public void setWigth(double wigth) {
        super.setWigth(wigth);
        super.setLength(wigth);
    }
}
