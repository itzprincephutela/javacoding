
import java.util.Scanner;

public class Divisible_NUMBER{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("ENTER THE NUMBER : ");
     int num = input.nextInt();
     if(num%5==0 && num%11==0)
     System.out.println("The Number Is Divisible with 5 and 11");
     else 
     System.out.println("Not Divisible");
    }
}