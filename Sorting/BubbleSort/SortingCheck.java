import java.util.*;
class SortingCheck {
    public static void main(String[] args) {
        int[] arr ={1,1,1,2,3,4,5,6};
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]<=arr[i+1]){
                System.out.println("Array Sorted : ");
            }
            else{
                System.out.println("Array not Sorted : ");
            }
        }
    }
}