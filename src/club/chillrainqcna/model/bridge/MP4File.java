package club.chillrainqcna.model.bridge;

/**
 * @author ChillRain 2023 02 10
 * 具体实现化
 */
public class MP4File implements VedioFile{
    //private String name;

    @Override
    public void decode(String name) {
        System.out.println("decode mp4..." + name);
    }
}
