

public class Waves {public static void print(int[][] arr) {
    int m =arr.length;
    int n =arr[0].length;
    for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println();
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        int m = arr[0].length;

      for (int j = 0; j < arr.length; j++) {
        if(j%2==1){
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i][j]+" ");
      }
    }
    else{
        for(int i = m-1 ; i>=0 ;i--){
            System.out.print(arr[i][j]+" ");
        }
    }
    System.out.println();
      }

    }
}
