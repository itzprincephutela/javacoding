import java.util.Scanner;

public class ReverseWords {
    public static void reverseS(StringBuilder str, int i, int j) {
        while (i < j) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int i = 0;
        int j = 0;
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == ' ') {
                reverseS(str, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        reverseS(str, i, j - 1);
        System.out.println(str);
    }
}
