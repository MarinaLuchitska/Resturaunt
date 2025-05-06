package lab_2_resturaunt;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1, "Олена");
        String[] menuItems = {"Піца", "Капучино", "Тірамісу"};
        Order order = new Order(1001, client, menuItems);

        Administrator admin = new Administrator("Ігор");

        System.out.println(order);
        admin.confirmOrder(order);
        admin.acceptPayment(order);
        System.out.println(order);
    }
}