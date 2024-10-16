
public class SumOFARRAY {

    public static int Sum(int[] arr, int idx) {
        if (arr.length - 1 == idx) {
            return arr[idx];
        }
        int small = Sum(arr, idx + 1);
        return small + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 1, 9, 8, 7, 7};
        int sum = Sum(arr, 0);
        System.out.println(sum);
    }
}
