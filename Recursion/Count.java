public class Count {
    public static int count(int n){
        if(n==0) return n;
        return 1 + count(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(count(n));
    }
}
