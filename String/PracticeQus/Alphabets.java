import java.util.*;
public class Alphabets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        int[] freq = new int[26];
        //0-a,1-b,2-c
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            int idx =(int)ch - 97 ;
            freq(idx)++;
        }
    }
}