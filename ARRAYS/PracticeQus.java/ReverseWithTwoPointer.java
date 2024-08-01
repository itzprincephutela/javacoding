public class ReverseWithTwoPointer {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
    System.out.print("Original Array: ");
    displayArray(array);
    reverseArray(array);
    System.out.print("Reversed Array: ");
    displayArray(array);
    }
    public static void reverseArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        for(int i = 0 ; i < arr.length ;i++){
            while(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        
    }
    public static void displayArray(int[] arr) {
        for (int num : arr) {
        System.out.print(num + " ");
        }
        System.out.println();
        }
        public static void swap(int[] arr,int start ,int end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
