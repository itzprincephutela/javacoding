import java.util.Arrays;
import java.util.Collections;

public class BuiltInSort {
    public static void main(String[] args) {
        // Initial array
        Integer[] arr = {10, 5, 50, 60, 70};

        // Sort in ascending order
        Arrays.sort(arr);
        System.out.print("Ascending order: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Descending order: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
