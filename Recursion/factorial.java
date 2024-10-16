public class factorial {

    public static int fact(int n) {
        if (n == 0) return 1;
        int small = fact(n-1);
        int ans = n * small;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is " + result);
    }
}