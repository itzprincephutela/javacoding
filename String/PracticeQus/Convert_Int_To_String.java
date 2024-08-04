
import java.util.Scanner;

public class Convert_Int_To_String {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x =sc.nextInt();
        // String str = "";
        // str = str + x; normal way
        // fuction of integer to String
        String str =Integer.toString(x);
        System.out.println(str);
        System.out.println(str.length());


    }
}
