public class Qus_1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        // Arrays.sort(arr);
        
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();//new line

        // for(int i = 0 ; i <= arr.length/2; i++){
        //     int j = arr.length-1 -i;               bad code 
        //     int temp = arr[i];
        //     arr[i]= arr[j];
        //     arr[j]= temp;
        // }

        // two pointer approch
        int i = 0 ;
        int j = arr.length-1;

        while(i<=j){
             swap(arr,i,j);
             i++;
             j--;
        }

        //print array
        for(int ele : arr ){
            System.out.print(ele+" ");
        }

    }

    public static void swap(int[] arr , int i , int j ) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}