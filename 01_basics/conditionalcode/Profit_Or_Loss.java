
import java.util.Scanner;

public class Profit_Or_Loss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost Price :");
        int cp = sc.nextInt();
        System.out.println("Enter the Selling Price :");
        int sp = sc.nextInt();

        if (sp > cp) {
            System.out.println("Profit is "+ (sp - cp));
        }
        if (sp == cp) {
            System.out.println("No Profit NO loss");
            
        }
         if(sp<cp) {
            System.out.println("Loss is " +(sp - cp) );
        }
    }
}
