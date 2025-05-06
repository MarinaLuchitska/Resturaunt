package lab_2_resturaunt;

public class Order {
    private long id;
    private Client client;
    private String[] items;
    private boolean confirmed;
    private boolean paid;

    public Order(long id, Client client, String[] items) {
        this.id = id;
        this.client = client;
        this.items = items;
    }

    public void confirm() {
        this.confirmed = true;
        System.out.println("Order confirmed by administrator.");
    }

    public void pay() {
        if (confirmed) {
            this.paid = true;
            System.out.println("Order has been paid.");
        } else {
            System.out.println("Order must be confirmed before payment.");
        }
    }

    public String toString() {
        return "Order{id=" + id + ", client=" + client.getName() +
                ", items=" + String.join(", ", items) +
                ", confirmed=" + confirmed + ", paid=" + paid + "}";
    }
}
