import java.util.*;
public class Compposite {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
             for(int  i = 2 ; i <=n-1 ;++i){ //2 se le n=24-1;
                if(n%i==0){
                System.out.println("Composite Number");
                    break;
                }//new line
                else
            System.out.println("Prime");
            break;
                   
             }
             if(n==1)System.out.println("Niether prime or composite");
    }
}
 