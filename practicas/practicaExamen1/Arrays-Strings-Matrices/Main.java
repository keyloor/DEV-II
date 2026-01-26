import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        buildArray();
    }

    public static void buildArray() {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int value = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Insert a the " + i + " value: ");
            value = sc.nextInt();
            a[i] = value;
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
