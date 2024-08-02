import java.util.Scanner;

public class Multiply {

    // Method to input a matrix
    public static void inputMatrix(int[][] matrix, int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of matrix A
        System.out.println("Enter number of rows for matrix A:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns for matrix A:");
        int m = sc.nextInt();

        // Input dimensions of matrix B
        System.out.println("Enter number of rows for matrix B:");
        int p = sc.nextInt();
        System.out.println("Enter number of columns for matrix B:");
        int q = sc.nextInt();

        // Check if multiplication is possible
        if (m != p) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        // Input matrices A and B
        int[][] a = new int[n][m];
        int[][] b = new int[p][q];

        System.out.println("Enter elements of matrix A:");
        inputMatrix(a, n, m);

        System.out.println("Enter elements of matrix B:");
        inputMatrix(b, p, q);

        // Initialize result matrix C
        int[][] c = new int[n][q];

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < p; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result matrix C
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
