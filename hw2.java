package class9;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println("Apply for a credit card");
            String userResponce= scanner.next();
            if (userResponce.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
