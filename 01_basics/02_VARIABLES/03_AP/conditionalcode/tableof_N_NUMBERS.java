import java.util.Scanner;

public class tableof_N_NUMBERS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println ("Enter the Number : ");
            int n = sc.nextInt();
            for(int i = n ; i <= n*10 ; i+=5){
                System.out.println(i);

            }
    }
}
