class calculator{
    int a ;
    int b ;
    int sum ;

    void add(){
        int a = 10 ;
        int b = 20 ;
        sum = a + b;
        System.out.println(sum);

    }
}
public class voidwithoutparametrs {
    public static void main(String[] args) {
        calculator cal = new calculator();
        cal.add();
        
    }
}
