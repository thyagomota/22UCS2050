/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 25 - CashRegister
 */

import java.util.Scanner;

public class CashRegister {

    private Hashtable<String, Vegetable> ht;
    public static final int OPTION_LOOKUP = 1;
    public static final int OPTION_UPDATE = 2;
    public static final int OPTION_QUIT   = 3;
    public static Scanner sc = new Scanner(System.in);

    public CashRegister() {
        // TODO #1: instantiate the hashtable and add the following vegetables:
        // Corn: $0.25
        // Cucumber (ick!): $0.99
        // Spinach: $0.33
        // Onion:  $0.13
    }

    public static int getOption() {
        while (true) {
            System.out.println("Options: 1:price lookup 2:price update 3:quit");
            System.out.print("? ");
            String line = sc.nextLine();
            try {
                int option = Integer.parseInt(line);
                if (option == OPTION_LOOKUP || option == OPTION_UPDATE || option == OPTION_QUIT)
                    return option;
            }
            catch (NumberFormatException ex) {  }
            System.out.println("Error!");
        }
    }

    // TODO #2: finish the method's implementation
    public double priceLookup(final String name) {

    }

    // TODO #3: finish the method's implementation
    public void updatePrice(final String name, final double price) {

    }

    public static void main(String[] args) {
        System.out.println("Welcome to my cash register!");
        CashRegister cr = new CashRegister();
        boolean quit = false;
        String name = "";
        double price = -1;
        while (!quit) {
            int option = getOption();
            switch (option) {
                case OPTION_LOOKUP:
                    System.out.print("Veggie? ");
                    name = sc.nextLine();
                    price = cr.priceLookup(name);
                    if (price == -1)
                        System.out.println("Not found!");
                    else
                        System.out.println("$" + String.format("%.2f", price));
                    break;
                case OPTION_UPDATE:
                    System.out.print("Veggie? ");
                    name = sc.nextLine();
                    System.out.print("$? ");
                    price = Double.parseDouble(sc.nextLine());
                    cr.updatePrice(name, price);
                    break;
                case OPTION_QUIT:
                    quit = true;
            }
        }
        System.out.println("Bye!");
    }
}
