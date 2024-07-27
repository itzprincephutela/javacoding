// // package Patterns.Triangle;
// n+1-import 
// *****
// ****
// ***
// **
// *
import java.util.Scanner;

public class trainglesquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <=n+1-i ; j++){//n ***   //i  *
                                             //  ***   //   * *
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
        
}
