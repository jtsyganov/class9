package class9;

public class hw1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
