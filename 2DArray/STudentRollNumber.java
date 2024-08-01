
import java.util.Scanner;

public class STudentRollNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] student = new int[4][2];
        System.out.print("Roll number AND MARKS : ");
        for (int i = 0; i < student.length; i++) {
            for(int j =0 ; j<student[0].length ; j++){
                student[i][j]=sc.nextInt();
            }
            
        }
        for (int i = 0; i < student.length; i++) {
            for(int j =0 ; j<student[0].length ; j++){
                System.out.print(student[i][j]+" ");
            }
            System.out.println();
        }

    }
}
