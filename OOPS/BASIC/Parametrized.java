public class Parametrized{
    public static class Default{
        int x ; 
        int y ; 
          Default(int a , int b){
             x = a;
             y = b ;
             
         }
         void add(){
             System.out.println(x+y);
         }
    }
    public static void main(String args[]){
        Default D  = new Default(100,200);
        D.add();
        
    }
}