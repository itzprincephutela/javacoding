// package ARRAYS.Basic_And_Quse;
// given Array print index number those student marks  less then 35;

public class Qus_1_Array {
    public static void main(String[] args) {
        int[] arr ={81,54,32,24,54,85};
        int n = arr.length;
        for(int i = 0 ; i <= n ; i++){
            if(arr[i]<=35){
                System.out.println(i + " = " + arr[i]);
            }
        }
    }

    
}
