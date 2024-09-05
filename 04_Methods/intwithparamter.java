class Calculator{//instance
    int a ;
    int b ;
    int sum;
    

    int add()
    {
        int a =10;
        int b = 20;
        sum = a + b ;
        return sum;
    }
}

public class intwithparamter{
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add());
         
    }
}
