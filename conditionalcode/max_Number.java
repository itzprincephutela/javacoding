
import java.util.Scanner;

public class max_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the NUMBER 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter the NUMBER 2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("NUM1 IS GREATER");
        } else {
            System.out.println("NUM2 IS GREATER");
        }

        input.close();  // Always close the Scanner
    }
}
