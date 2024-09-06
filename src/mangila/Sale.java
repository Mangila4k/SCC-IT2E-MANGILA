package mangila;

import java.util.Scanner;

public class Sale {

    public void processSale() {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter Customer name: ");
        String cname = myInput.nextLine();
        System.out.print("Enter Product name: ");
        String pname = myInput.nextLine();
        System.out.print("Enter Quantity: ");
        int quanti = myInput.nextInt();
        System.out.print("Enter price: ");
        int price = myInput.nextInt();
        System.out.print("Enter cash: ");
        int cash = myInput.nextInt();

        Sales sales = new Sales();
        sales.setSalesDetails(cname, pname, quanti, price, cash);
        sales.printReceipt();
    }
}
