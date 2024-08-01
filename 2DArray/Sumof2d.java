

public class Sumof2d {
    public static void main(String[] args) {
        int[][] arr ={{1,2,30,},{1,2,3},{1,2,3}};
        int m = arr.length;//row
        int n = arr[0].length;//column
        int sum =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
