import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ascendantOrder();

        // arraySum3by3();

        // arraySum();

        // average();

        // buildArray();
    }

    public static void buildArray() { // 1
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Insert a the " + i + " value: ");
            a[i] = sc.nextInt();
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void average() { // 2
        //We ask for user input for creation of the new array
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Insert a the " + i + " value: ");
            a[i] = sc.nextInt();
        }

        int negative = 0;
        int positive = 0;
        int positiveC = 0; //Counter for average
        int zeros = 0;

        //We calculate the ammount for each
        for (int i : a) {
            if(i < 0) {
                negative++;
            } else if(i > 0) {
                positive += i;
                positiveC++;
            } else {
                zeros++;
            }
        }

        //We calculate the average for positive numbers
        positive = positive / positiveC;

        System.out.println("Negative: " + negative +"\nPositive average: " + positive + "\nZeros: " + zeros);


    }

    public static void arraySum() { // 3
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] c = new int[a.length + b.length];

        int cIndex = 0;
        
        for (int i = 0; i < a.length; i++) { // Array a
            c[cIndex] = a[i];
            cIndex++;

            c[cIndex] = b[i];
            cIndex++;
            
        }

        for (int i : c) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

    }

    public static void arraySum3by3() { // 4
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int[] c = new int[a.length + b.length];

        int cIndex = 0;
        int aIndex = 0;
        int bIndex = 0;
        
        
        while(cIndex < c.length) {

            for (int j = 0; j < 3; j++) {
                c[cIndex] = a[aIndex];
                cIndex++;
                aIndex++;
            }

            for (int k = 0; k < 3; k++) {
                    c[cIndex] = b[bIndex];
                    cIndex++;
                    bIndex++;
            }
            
        }

        for (int i : c) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }

    public static void ascendantOrder() {
        String[] strings = {"ana", "beto", "carlos", "danielito", "ernesto", "fausto", "gery", "hector", "ignacio", "jota"};
        
        System.out.println();

        boolean status = false;

        for (int i = 0; i < strings.length; i++) {

            if(i < strings.length - 1) {
                System.out.println("Checking " + strings[i] + " with " + strings[i + 1]);
                int result = strings[i].compareTo(strings[i + 1]);
                System.out.println(result);

                if(result == -1) {
                    status = true;
                } else {
                    status = false;
                    break;
                }
            }
            
            
        }
        
        System.out.println("Ascendant order? " + status);
    }










}
