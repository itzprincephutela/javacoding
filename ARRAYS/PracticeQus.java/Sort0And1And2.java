public class Sort0And1And2 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,2,2,2,1,0,1,0};
        System.out.println("Orignal Array");
        displayArray(arr);
       
       sortcolors(arr);
       System.out.println("Sort Array");
       displayArray(arr); 
    }
    public static void sortcolors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
            else if(arr[mid]==1){
                mid++;
            }
        }
        
    }
    public static void displayArray(int[] arr) {
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr , int i , int j ) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
