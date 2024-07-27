// <!-- ###*            ###         *
//      ##**            ##          ** 
//      #***            #           ***
//      ****                        **** -->

// package Patterns.Star;

import java.util.Scanner;

public class compositen {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2+1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ;j <= n-i;j++ ){
                System.out.print(" "+" ");
                
            }
            for(int j = 1 ;j <=i;j++ ){
                System.out.print(j+" ");
                
            }
            System.out.println(" ");
        }
      
    }
    
}
