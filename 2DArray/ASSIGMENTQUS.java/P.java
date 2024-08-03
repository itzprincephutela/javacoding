import java.util.Scanner;

public class P {
    public static void input(int[][] arr, int m, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void printDiagonals(int[][] arr) {
        int n = arr.length;

        // Print Main Diagonal
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        // Print Anti-Diagonal
        System.out.print("Anti-Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][n - i - 1] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix (n x n):");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        input(arr, n, n);
        printDiagonals(arr);
    }
}
