
class Calculator {
    // Add is Method and we declared var inside a Method 

    public  void add(int a, int b) {

    int result = a + b ;


        System.out.println("The Sum : " + result);

    }
}

public class LOCAL {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10, 20);
    }
}
