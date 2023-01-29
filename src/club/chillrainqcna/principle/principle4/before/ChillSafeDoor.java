package club.chillrainqcna.principle.principle4.before;

/**
 * @author ChillRain 2023 01 29
 */
public class ChillSafeDoor implements SafeDoor{

    @Override
    public void antiTheft() {
        System.out.println("antiTheft");
    }

    @Override
    public void fireProof() {
        System.out.println("fireProof");
    }

    @Override
    public void waterProof() {
        System.out.println("waterProof");
    }
}
