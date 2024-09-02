
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the L :");
        int l = sc.nextInt();
        System.out.println("Enter the W :");
        int w = sc.nextInt();
        int area = l * w;
        int perimeter = 2 * (l + w);
        if (area > perimeter) {
            System.out.println("area is greater than perimeter");
        }
        if (area == perimeter) {
            System.out.println("Equal");
        }
        if (area < perimeter) {
            System.out.println("Perimeter is greater tha area");
        }
        }
}
