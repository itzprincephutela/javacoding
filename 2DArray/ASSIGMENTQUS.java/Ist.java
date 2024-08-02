public class Ist {
    public static void main(String[] args) {
        // write a program to store 10 at every index with 2d matrix with 5Row and 5Column
        int m = 5 ;
        int n = 5 ;
        int[][] arr = new int[5][5];
        for(int i = 0 ; i < 5 ;i++){
            for (int j = 0; j < 5; j++) {
                arr[i][j]=10;
            }
        }
        for(int i = 0 ; i < 5 ;i++){
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
