import java.util.Scanner;
public class Print_1_To_N {
    public static void Print(int n,int b) {
        if(b==n+1) return ;
        System.out.println(b);
        Print(n,b+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b = 1;
        Print(N,b);
    }
}
