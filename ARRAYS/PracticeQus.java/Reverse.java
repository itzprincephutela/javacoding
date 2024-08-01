public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] rev = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
            rev[i]=arr[arr.length-1-i];//copy last element of array
        }

        System.out.print("Original Array: ");
        displayArray(arr);
        System.out.print("Reversed Array: ");
        displayArray(rev);
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
        System.out.print(num + " ");
        }
        System.out.println();
        }
        
}
