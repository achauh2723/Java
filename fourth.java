package packages;

import java.util.Scanner;
import java.lang.*;


public class fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }

        System.out.print("Array: ");
        for (int element : myArray) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
