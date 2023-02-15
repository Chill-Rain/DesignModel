package club.chillrainqcna.model.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChillRain 2023 02 15
 */
public class Order {
    private Map<String ,Integer> list = new HashMap<>();

    public void setFood(String name, Integer num){
        list.put(name, num);
    }

    public Map<String, Integer> getList() {
        return list;
    }
}
