import java.util.*;
class CountNebhiour  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        String Str = sc.nextLine();
        for(int i = 0 ; i < Str.length() -1 ;  i++){
           if(Str.charAt(i)!=Str.charAt(i+1)){
               count++;
           }
        }
        System.out.println(count);
    }
}
