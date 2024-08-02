
import java.util.Scanner;

public class SecondQus {
    public static void input(int[][] arr,int m , int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<m ; i++){
            for(int j = 0 ; j< n ;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
    }
    public static void print(int[][] arr) {
        for (int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // write a fuction two add a matrix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row m of ist arr ");
        int m = sc.nextInt();
        System.out.println("Enter the column N of ist arr ");
        int n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        
        int[][] arr2 = new int[m][n];
        System.out.println("input of ARR1");
     
        input(arr1,m,n);
        System.out.println("input of ARR2");
        input(arr2,m,n);
        print(arr1);
        System.out.println();
        print(arr2);
        System.out.println();
        for (int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println();
        print(arr1);
        

    }
}
