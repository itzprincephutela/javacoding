
public class ST2 {
    public  static boolean ispalidrome(String s){
        int i = 0 ;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
       // StringBuilder SB= new StringBuilder("hello World");
        // StringBuilder str = new StringBuilder("hello World");
        // System.out.println(SB.toString());
        // String S = SB.toString();
        // S += "world";

        // // SB +="YHa";
        // System.out.println(S);

        // SB.setCharAt(0, 'I');
        // SB.insert(0, 'I');
        // System.out.println(SB);
        // System.out.println(SB.length());
        // System.out.println(SB.reverse());

        // String s = "Prince Phutela";
        // StringBuilder sb = new StringBuilder(); // 
        // for(int i = 0 ; i <s.length() ;i++){
        //     char c = s.charAt(i);

        //     if(Character.isUpperCase(c)){
        //         sb.append(Character.toLowerCase(c));
        //     }
        //     else if(Character.isLowerCase(c)) {
        //         sb.append(Character.toUpperCase(c));
        //     }
        //     else {
        //         sb.append(c); // Non-alphabetic characters remain unchanged
        //     }
        // } 
        // System.out.println(sb.toString());








        String s = "madam arora a noon";
        StringBuilder sb =new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < s.length();i++){
            
            for(int j = i+ 1 ; j<=s.length();j++){
                if(ispalidrome(s.substring(i,j))==true ){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
