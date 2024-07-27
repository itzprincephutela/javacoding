import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println ("Enter the Number : ");
            int number = sc.nextInt();
            int sum = 0;
            while(number!=0){
                int reminder = number % 10 ;
             sum = sum + reminder;
             number /= 10;
            }
            System.out.println(sum);
    }
}
