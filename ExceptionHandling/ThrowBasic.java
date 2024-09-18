
class YoungerAgeException extends Exception{
        YoungerAgeException(String MSG){
            super(MSG);
        }
}
public class ThrowBasic {
    public static void main(String[] args) {
        int age = 16;
        try{
            if(age<18){
                throw new YoungerAgeException("NOTVALID");
            }
            else{
                System.out.println("Valid");
                
            }
        }
        catch(YoungerAgeException e){
            e.printStackTrace();
        }
      
    }
}
