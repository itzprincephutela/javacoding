public class Copy_constructor{
    public static class Copy{
        int a ;
        int b ; 
        
        Copy(int x ,int y){
            a = x;
            b = y;
            System.out.println(a+b);
        }
        Copy(Copy ref){
            a = ref.a;
            b = ref.b;
             System.out.println(a+b);
        }
    
    }
    public static void main (String args[]){
        Copy C = new Copy(10,20);
        Copy C2= new Copy(C);
        
    }
}