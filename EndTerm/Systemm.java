import java.util.*;
;public class Systemm{
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
      
        int[] arr = new int[10];
        for(int i = 0 ; i < 10 ;i++){
            arr[i]=sc.nextInt();
        }
        String str = Arrays.toString(arr);
        throw new ArithmeticException(str);
    }
}