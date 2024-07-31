
import java.util.*;

// package 2D_Array_List;

public class basic {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(100);
        a.add(20);

        List<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(100);
        b.add(20);

        List<Integer> c = new ArrayList<>();

        List<List<Integer>> Arr = new ArrayList<>();
        Arr.add(a);
        Arr.add(b);
        Arr.add(c);
        for(int i = 0 ; i<a.size() ;i ++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        for(int i = 0 ; i<Arr.size() ;i ++){
            System.out.print(Arr.get(i)+" ");
        }
        System.out.println(Arr.get(1).get(2));

    }
}
