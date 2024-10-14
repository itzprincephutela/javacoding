import java.util.Scanner;
public class Print_N_To_1 {
    public static void Print(int n) {
        if(n==0) return ;
        System.out.println(n);
        Print(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Print(N);
    }
}
