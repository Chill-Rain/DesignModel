package club.chillrainqcna.model.command;

/**
 * @author ChillRain 2023 02 15
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setFood("九转大肠", 114514);
        order.setFood("昏睡红茶",1919810);
        SeniorChef seniorChef = new SeniorChef();
        OrderCommand orderCommand = new OrderCommand(order, seniorChef);
        Waitor waitor = new Waitor();
        waitor.setCmd(orderCommand);
        waitor.orderUp();
    }
}
