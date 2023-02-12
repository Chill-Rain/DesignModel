package club.chillrainqcna.model.combination;

/**
 * @author ChillRain 2023 02 12
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 2);
        MenuComponent child1 = new MenuItem("页面访问", 3);
        MenuComponent child2 = new MenuItem("展开菜单", 3);
        MenuComponent child3 = new MenuItem("编辑菜单", 3);
        menu1.add(child1);
        menu1.add(child2);
        menu1.add(child3);
        MenuComponent menu2 = new Menu("权限管理", 2);
        MenuComponent child4 = new MenuItem("页面访问1", 3);
        MenuComponent child5 = new MenuItem("展开菜单1", 3);
        MenuComponent child6 = new MenuItem("编辑菜单1", 3);
        menu2.add(child4);
        menu2.add(child5);
        menu2.add(child6);
        MenuComponent menu3 = new Menu("角色管理", 2);
        MenuComponent child7 = new MenuItem("页面访问2", 3);
        MenuComponent child8 = new MenuItem("展开菜单2", 3);
        MenuComponent child9 = new MenuItem("编辑菜单2", 3);
        menu3.add(child7);
        menu3.add(child8);
        menu3.add(child9);
        MenuComponent root = new Menu("系统管理", 1);
        root.add(menu1);
        root.add(menu2);
        root.add(menu3);
        root.print();
    }
}
