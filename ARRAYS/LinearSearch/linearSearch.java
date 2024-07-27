// package ARRAYS.LinearSearch;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target Value : ");
        int x = sc.nextInt(); 
        System.out.print("Enter the Size of Array : ");
        int Size = sc.nextInt();
        int[] arr = new int [Size] ;  
        for (int i=0 ; i <Size ; i++ ){
                arr[i]=sc.nextInt();
        }

        boolean flag=false;

        for (int i=0 ; i <Size ; i++ ){
                if(arr[i]==x){
                    flag=true;
                    break;
                }   
        }
        System.out.println(flag);
        
    }
    
}
