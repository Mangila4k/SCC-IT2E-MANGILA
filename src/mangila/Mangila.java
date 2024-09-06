package mangila;

import java.util.Scanner;

public class Mangila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Select an option:");
            System.out.println("1. Accounts");
            System.out.println("2. Grades");
            System.out.println("3. Sale");
            System.out.println("4. Products");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:

                    Account account = new Account();  
                    account.getAccounts();    
                    break;

                case 2:
                    Grades gr = new Grades();
                    gr.addGrades(1011, "Micole Gwapo", 1.0, 2.2, 2.3, 1.3);
                    gr.viewGrades();
                    break;

                case 3:
                    Sale sale = new Sale();
                    sale.processSale();
                    break;

                case 4:
                    Product product = new Product();
                    product.manageProduct();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println();

        } while (choice != 0);

        scanner.close();
    }
}
