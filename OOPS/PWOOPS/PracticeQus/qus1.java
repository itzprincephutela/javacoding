class Complex{
     private int real;
     private int img;
     public void setComp(int r , int i){
        real = r;
        img  = i;
     }
     public void printComplex(){
        System.out.println("Real :"+real+" "+"img :"+img);
     }
}

public class qus1 {
    public static void main(String[] args) {
        Complex c = new Complex();
        c.setComp(10,20);
        c.printComplex();
    }
}
