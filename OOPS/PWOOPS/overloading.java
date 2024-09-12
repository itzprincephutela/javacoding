
class Calculator {
    // Method with two parameters
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    // Method with three parameters (method overloading)
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
public class overloading {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        // Call the method with two parameters
        c1.add(10, 20);

        // Call the method with three parameters
        c1.add(10, 20, 30);
    }
}
