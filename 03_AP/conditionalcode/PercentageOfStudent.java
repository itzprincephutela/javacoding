
import java.util.Scanner;

public class PercentageOfStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks :");
        int Marks = sc.nextInt();
        if (Marks >= 81 && Marks <= 100) {
            System.out.println("Very Good");
        } else if (Marks >= 61 && Marks <= 80) {
            System.out.println(" Good");
        } else if (Marks >= 41 && Marks <= 60) {
            System.out.println(" Good");
        } else {
            System.out.println("Fail");
        }
    }
}
