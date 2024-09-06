package mangila;

public class Products {

    private int id;
    private String name;
    private double price;
    private int stocks;
    private int sold;

    public void setProductDetails(int id, String name, double price, int stocks, int sold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stocks = stocks;
        this.sold = sold;
    }

    public void viewProductDetails() {
        double profit = this.price * this.sold;
        double totalValue = this.stocks * this.price;
        String status = (this.stocks > 0) ? "Available" : "Out of Stock";

        System.out.printf("%-10d %-20s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n",
                this.id, this.name, this.price, this.stocks, this.sold, profit, totalValue, status);
    }
}
