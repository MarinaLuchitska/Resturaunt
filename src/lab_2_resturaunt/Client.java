package lab_2_resturaunt;

public class Client {
    private long id;
    private String name;

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Client{id=" + id + ", name='" + name + "'}";
    }
}
