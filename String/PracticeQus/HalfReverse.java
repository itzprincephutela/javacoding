import java.util.*;

class HalfReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the even number of characters string: ");
        String str = sc.nextLine();
        
        if (str.length() % 2 == 0) {
            int halfLength = str.length() / 2;
            StringBuilder reverseBuilder = new StringBuilder(str.substring(0, halfLength));
            reverseBuilder.reverse();
            
            System.out.print(reverseBuilder.toString() + str.substring(halfLength));
        } else {
            System.out.println("Please enter a string with an even number of characters.");
        }
    }
}
