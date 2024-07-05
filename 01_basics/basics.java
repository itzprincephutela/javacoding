import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close(); // Close the scanner to prevent resource leak
    }
}
                                // //////////////////////////////////////////