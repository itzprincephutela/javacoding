class Box{
    int a = 0, b = -1; //instance variable
    static int k = 10;  //Static

    void SetA(int x){
        a = x ;
    }
    void SetB(int y){ //instance Method
        b = y;
    }
    static void SetK(int z){//Static Method
        k = z;
        
    }
}
public class StaticMethod{
    public static void main(String[] args) {
        Box B1 = new Box();
        B1.SetA(100);
        B1.SetB(200);
        B1.SetK(300); // this is wrong
        Box.SetK(3000);//Static method always Call with Class name 
        System.out.println(B1.a);
        System.out.println(B1.b);
        System.out.println(B1.k);
        System.out.println(B1.k);
    }
}