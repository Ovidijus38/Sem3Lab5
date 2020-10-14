public class Product {

    private int id;
    private String name;
    private String description;
    private static int totalAcc = 1000000;


    public Product( String name, String description)
    {
        incrementCount();
        setId();
        setName(name);
        setDescription(description);

    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = totalAcc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString()
    {
        return "Product details are as follows: ID " + id + "\nName: " + name + "\nDescription: " + description;
    }

    private static void incrementCount()
    {
        totalAcc++;
    }
}
