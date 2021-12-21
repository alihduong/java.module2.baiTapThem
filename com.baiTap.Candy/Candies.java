public class Candies {
    private static int VALUE = 0;
    private int id;
    private String colors;
    private String featured;
    private int quantity;
    private double price;

    public Candies() {
    }

    public Candies(String colors, String featured, int quantity, double price) {
        this.id = ++ VALUE;
        this.colors = colors;
        this.featured = featured;
        this.quantity = quantity;
        this.price = price;
    }

    public static int getVALUE() {
        return VALUE;
    }

    public static void setVALUE(int VALUE) {
        Candies.VALUE = VALUE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candies{" +
                "id=" + id +
                ", colors='" + colors + '\'' +
                ", featured='" + featured + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
