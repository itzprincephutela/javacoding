import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        String str ="prince";
        char[] arr = str.toCharArray();
        for(char ele:arr){
            System.out.print(ele);
        }
        Arrays.sort(arr);
        System.out.println();
        for(char ele:arr){
            System.out.print(ele);
        }

    }
}
