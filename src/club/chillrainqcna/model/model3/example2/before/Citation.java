package club.chillrainqcna.model.model3.example2.before;

/**
 * @author ChillRain 2023 02 05
 */
public class Citation implements Cloneable{
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}
