import java.util.Scanner;

public class multiply {
    public static int mul(int n,int k){
        if(k==1) return k;
        mul(n, k-1);
        return n*k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(mul(n,k));
    }
}