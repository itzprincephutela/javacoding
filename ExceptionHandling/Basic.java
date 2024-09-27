// public class Basic{

//     public static void main(String[] args) {
//         int a = 100 ;
//         int  b = 0 ;
//         int c ;
//         try{
//          c = a / b;
//         }
//         catch(Exception e){
//             e.printStackTrace();
//             // System.out.println(e.toString());
//             // System.out.println(e.getMessage());
//         }
//     }
//
import java.util.*;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            if (b == 0) {
                throw new Naya("Cannot divide by zero");
            } else {
                int result = a / b;
                System.out.println("Valid");
            }
        } catch (Naya e) {
            System.out.println( e.getMessage());
        }
    }
}

class Naya extends Exception {

    Naya(String msg) {
        super(msg);
    }
}