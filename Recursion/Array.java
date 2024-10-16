public class Array {
    public static void printArray(int[] arr, int ind){
        if(ind==arr.length){
            return ;
        }
        System.out.println(arr[ind]);
        printArray(arr,ind+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr,0);
    }
}
