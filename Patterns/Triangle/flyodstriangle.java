import java.util.Scanner;

public class flyodstriangle {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ;j <= i ;j++ ){
            a++;
                System.out.print(a +" ");
            }
            System.out.println(" ");
        }
      
    }
}