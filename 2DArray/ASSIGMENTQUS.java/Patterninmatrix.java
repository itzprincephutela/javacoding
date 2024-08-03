import java.util.Scanner;

public class Patterninmatrix {
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
        // find the largest element in 2d array
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row m of ist arr ");
        int m = sc.nextInt();
        System.out.println("Enter the column N of ist arr ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of arr");
        int[][] arr = new int[m][n];
        input(arr,m,n);
        int mid = m/2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(mid==i || mid==j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            } System.out.println();
        }
           
       
    }
}
