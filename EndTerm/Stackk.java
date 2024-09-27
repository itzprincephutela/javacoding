
import java.util.*;

public class Stackk {

    public static void main(String[] args) {
        Stack<String> Str = new Stack<>();
        Str.push("lion");
        Str.push("cat");
        Str.push("dog");
        System.out.println(Str);
        System.out.println(Str.peek());
        Str.pop();
        System.out.println(Str.peek());
        Str.pop();
        System.out.println(Str.peek());
        Str.pop();
        System.out.println(Str);
    }
}
