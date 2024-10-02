

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4,5,6,7,8,9};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // Find the maximum element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // smax=max;
                max = arr[i];
            }
        }

        // Find the second maximum elements
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Second maximum element: " + smax);
    }
}
