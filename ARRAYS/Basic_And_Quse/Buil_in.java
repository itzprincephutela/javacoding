
import java.util.Arrays;

public class Buil_in{
    public static void main(String[] args) {
        int[] arr ={10,5,50,60,70};
        Arrays.sort(arr);            //Sort Fuction
        for(int ele :arr){         //For each Loops
            System.out.print(ele+" ");
        }
        change(arr);
        System.out.println();
        for(int ele :arr){         //For each Loops
            System.out.print(ele+" ");
        }       
        
    }
    public static void change(int[] arr) {
        arr[0]=500;        
    }
}