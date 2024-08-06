
import java.util.Scanner;

public class UpdateA_at_Even_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Prince kumar";
        String str = "";
        for (int i = 0; i<s.length(); i++) {
            if(i%2==0)str += 'a';                                                                                     
            else str += s.charAt(i);
        }
        System.out.println(str);
    }
}
