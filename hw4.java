package class9;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

        System.out.println("Please enter the item and price");
        String itemName=scanner.next();
        double itemPrice=scanner.nextDouble();
        totalPrice=totalPrice+itemPrice;
        System.out.println("Total amount to pay "+totalPrice);
    }
        System.out.println("Please pay for the items");
        double amountPaid= scanner.nextDouble();

        if (amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+change);
        } else if (amountPaid<totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Not enough money");

        }
        System.out.println("Thank you for shopping!");
    }
}
