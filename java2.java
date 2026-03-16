public class java2 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        int key = 30;
        boolean found = false;

        System.out.println("1D Array elements:");
        for (int n : nums) {
            System.out.print(n + " ");
            if (n == key) {
                found = true;
            }
        }
        System.out.println("\nLength: " + nums.length);
        System.out.println("Search " + key + ": " + (found ? "Found" : "Not Found"));

        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;

        System.out.println("\n2D Array elements:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
                sum += value;
            }
            System.out.println();
        }

        System.out.println("Rows: " + matrix.length);
        System.out.println("Columns in row 1: " + matrix[0].length);
        System.out.println("Sum: " + sum);
    }
}
