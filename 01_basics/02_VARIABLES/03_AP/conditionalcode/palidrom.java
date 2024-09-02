
import java.util.Scanner;

public class palidrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n1 = sc.nextInt();
        int org = n1; // Store the original number for comparison later
        int rev = 0;

        while (n1 != 0) {
            int ld = n1 % 10;
            rev = rev * 10 + ld; // Build the reversed number
            n1 /= 10; // Remove the last digit from n1
        }

        if (org == rev) { // Compare original number with reversed number
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
