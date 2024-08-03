public class RowAndcolumnmakezero {
    public static void print(int[][] arr) {
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
        int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
        int[][] copy=new int[arr.length][arr[0].length]; 
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                copy[i][j]=arr[i][j];
                if(copy[i][j]==0){
                    for(int a = 0 ; a < arr.length ; a++){
                        arr[i][a]=0;
                        for (int b= 0;  b< arr[0].length; j++) {
                           arr[b][j]=0;
                        }
                    }
                }
            }
        }
        print(arr);

    }
}
