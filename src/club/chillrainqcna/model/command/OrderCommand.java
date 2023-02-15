package club.chillrainqcna.model.command;

import java.util.Map;
import java.util.Set;

/**
 * @author ChillRain 2023 02 15
 * 具体命令
 */
public class OrderCommand implements Command{
    private Order order;
    private SeniorChef seniorChef;

    public OrderCommand(Order order, SeniorChef seniorChef) {
        this.order = order;
        this.seniorChef = seniorChef;
    }

    @Override
    public void excute() {
        Map<String, Integer> list = order.getList();
        Set<String> set = list.keySet();
        for (String s : set) {
            seniorChef.cook(s, list.get(s));
        }
    }
}
