// package ARRAYS.LinearSearch;

public class largest {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,58,52,45,84,88,745,4};
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
