import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            // Swap characters at positions i and j
           char temp = str.charAt(i);
           str.setCharAt(i, str.charAt(j));
           str.setCharAt(j, temp);
            i++;
            j--;
        }
         
        System.out.println(str.toString());
    }
}
