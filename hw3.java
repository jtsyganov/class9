package class9;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 2 numbers Starting and Ending");
        int start = s.nextInt();
        int end = s.nextInt();

        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum+=i;
            } else {
                oddSum=oddSum+i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}

