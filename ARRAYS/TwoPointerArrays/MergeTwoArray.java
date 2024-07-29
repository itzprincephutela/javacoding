
import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,5,8,9};
        int[] arr3 = new int[arr1.length+arr2.length];
        int i =0;
        int j =0;
        int k =0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Arrays.sort(arr1);
        while(true){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                k++;
                i++;
            }
            else if(arr1[i]>arr2[j]){
                arr3[k]=arr1[i];
            }
        }
        
    }
}
