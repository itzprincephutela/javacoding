
public class MaxinArray {

    public static int MAXPrint(int[] arr, int idx) {
        if (idx == arr.length) {
            return Integer.MIN_VALUE;
        }
        int max = MAXPrint(arr, idx + 1);
        return Math.max(arr[idx], max);

    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 1, 9, 8, 7, 7};
        int max = MAXPrint(arr, 0);
        System.out.println("Maximum value in the array: " + max);}
}
