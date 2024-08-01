
import java.util.Scanner;

public class Qus_Rotate_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter  the K number ");
        int k = sc.nextInt();
        int n = arr.length;
        k = k % n;
        reversearr(arr,0,n-k-1);//frist 
        reversearr(arr,n-k,n-1); //n-k array
        reversearr(arr,0,n-1);//full array
        System.out.println("Array Rotated");
        displayArray(arr);
}
    public static void reversearr(int[] arr,int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;end--;

        }
    }
    public static void displayArray(int[] arr) {
        for (int num : arr) {
        System.out.print(num + " ");
        }
        System.out.println();
        }
}
