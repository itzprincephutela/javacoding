public class Digit {
    public static int addition(int n) {
        if(n>=0 && n<=9){
            return n;
        }
        int small = addition(n/10);
        int ans = small + n % 10;
        return ans;
    }
    public static void main(String[] args) {
        int digit = 1234;
        System.out.println(addition(digit));

    }
}
