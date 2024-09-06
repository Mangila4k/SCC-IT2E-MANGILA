package mangila;

public class Sales {

    private String customerName;
    private String productName;
    private int quantity;
    private int price;
    private int cash;

    public void setSalesDetails(String cname, String pname, int quanti, int price, int cash) {
        this.customerName = cname;
        this.productName = pname;
        this.quantity = quanti;
        this.price = price;
        this.cash = cash;
    }

    public int calculateTotalDue() {
        return quantity * price;
    }

    public int calculateChange() {
        return cash - calculateTotalDue();
    }

    public void printReceipt() {
        System.out.println("---------------------------------");
        System.out.println("Name: " + customerName);
        System.out.println("Item name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("---------------------------------");
        System.out.println("Total due: " + calculateTotalDue() + ".00");
        System.out.println("Cash: " + cash + ".00");
        System.out.println("---------------------------------");
        System.out.println("Change: " + calculateChange() + ".00");
        System.out.println("---------------------------------");
    }
}
