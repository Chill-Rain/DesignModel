package club.chillrainqcna.model.bridge;

/**
 * @author ChillRain 2023 02 10
 * 抽象化角色
 */
public abstract class OpratingSystem {
    protected VedioFile file;

    public VedioFile getFile() {
        return file;
    }

    public void setFile(VedioFile file) {
        this.file = file;
    }
    public abstract void play(String name);
}
