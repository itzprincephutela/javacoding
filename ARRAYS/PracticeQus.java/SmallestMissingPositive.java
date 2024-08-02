import java.util.Arrays;
import java.util.Scanner;

public class SmallestMissingPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int missing = findSmallestMissingPositive(arr);
        System.out.println("The smallest missing positive element is: " + missing);
    }

    public static int findSmallestMissingPositive(int[] arr) {
        int expected = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expected) {
                expected++;
            }
        }
        return expected;
    }
}
