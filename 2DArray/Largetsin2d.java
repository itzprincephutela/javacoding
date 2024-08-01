
import java.util.Scanner;

public class Largetsin2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                maxx = Math.max(maxx, arr[i][j]);
            }
        }
        // for(int i = 0 ; i < 3 ; i++){
        //     for(int j = 0 ; j < 4 ; j++){
        //        if(arr[i][j]>max){
        //         max=arr[i][j];
        //        }
        //     }
        // }
        System.out.println("Output is : " + maxx);
        // for(int i = 0 ; i < 3 ; i++){
        //     for(int j = 0 ; j < 4 ; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

    }
}
