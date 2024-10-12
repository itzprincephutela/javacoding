import java.util.HashSet;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(300);
        set.add(30);
        set.add(-2);
        System.out.println(set);

        // System.out.println(set.contains(10));
        Object[] arr = set.toArray();
        for(int i = 0 ; i <arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
