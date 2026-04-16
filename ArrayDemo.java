import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- Single-Dimensional Array --------
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Elements in the array:");
        // Using for-each loop
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray Length: " + numbers.length);

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int num : numbers) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found in array.");
        else
            System.out.println("Element not found.");

        // -------- Multidimensional Array --------
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("\nMatrix Elements:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Processing: calculating sum of matrix elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        System.out.println("Sum of all elements in matrix: " + sum);
        sc.close();
    }
}