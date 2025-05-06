package restaurant;

public class Administrator {
    private String name;

    public Administrator(String name) {
        this.name = name;
    }

    public void confirmOrder(Order order) {
        order.confirm();
    }

    public void acceptPayment(Order order) {
        order.pay();
    }

    public String toString() {
        return "Administrator{name='" + name + "'}";
    }
}
