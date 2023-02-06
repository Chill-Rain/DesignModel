package club.chillrainqcna.model.model4.example;

/**
 * @author ChillRain 2023 02 06
 */
public class Phone {
    private String cpu;
    private String memory;
    private String mainBoard;
    private String disk;
    private String screen;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.disk = builder.disk;
        this.mainBoard = builder.mainBoard;
        this.screen = builder.screen;
    }
    public static class Builder{
        private String cpu;
        private String memory;
        private String mainBoard;
        private String disk;
        private String screen;
        public Builder cpu(String component){
            this.cpu = component;
            return this;
        }
        public Builder memory(String component){
            this.memory = component;
            return this;
        }
        public Builder mainBoard(String component){
            this.mainBoard = component;
            return this;
        }
        public Builder screen(String component){
            this.screen = component;
            return this;
        }
        public Builder disk(String component){
            this.disk = component;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }
}
