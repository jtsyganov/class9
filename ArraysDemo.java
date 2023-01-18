package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String name="Ivan";
        String name1="John";
        String name2="Bob";

        String [] names={"Ivan", "John", "Bob"};
        // System.out.println(names[2]);
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}
