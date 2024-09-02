import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        // Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
        Scanner sc = new Scanner(System.in);
            System.out.println ("Enter the Number : ");
            int n1 = sc.nextInt();
            System.out.println ("Enter the Number2 : ");
            int n2 = sc.nextInt();
            int G = 0;
            
            for(int i=1; i <= n2 ; i++){
                if(n1%i==0 && n2%i==0){
                     G = i;
                }
            }
            System.out.println(G);
    }
}
