package club.chillrainqcna.model.bridge;

/**
 * @author ChillRain 2023 02 10
 * 具体实现化
 */
public class AVIFile implements VedioFile{
    //private String name;
    @Override
    public void decode(String name) {
        System.out.println("decode avi..." + name);
    }
}
