package club.chillrainqcna.principle.principle1;

/**
 * @author ChillRain 2023 01 27
 * 测试
 */
public class Client {
    // 在修改皮肤过程中 没有修改原有代码
    public static void main(String[] args) {
        //创建搜狗输入法
        SouGouInput input = new SouGouInput();
        //为其创建皮肤
        DefaultSkin skin = new DefaultSkin();
        //设置输入法皮肤
        input.setSkin(skin);
        //展示皮肤
        input.display();
    }
}
