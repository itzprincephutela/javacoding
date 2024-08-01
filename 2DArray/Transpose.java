public class Transpose {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,4,5},{5,6,7}};
        int m =a.length;
        int n =a[0].length;
        int[][] tran=new int[n][m];
        System.out.println("Normal Print :");
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(a[i][j]+" ");
            }
            
        }
        System.out.println(); 
        System.out.println("Transpose Print :");
       
            for(int i = 0 ; i < m ; i++){
                for(int j = 0 ; j < n ; j++){
                tran[i][j]=a[j][i];
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(tran[i][j]+" ");
            }
            
        }
       } 
    }
