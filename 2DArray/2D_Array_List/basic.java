
import java.util.*;

// package 2D_Array_List;

public class basic {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(40);
        a.add(30);
        a.add(20);

        List<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(50);
        b.add(20);

        List<Integer> c = new ArrayList<>();

        List<List<Integer>> Arr = new ArrayList<>();
        Arr.add(a);
        Arr.add(b);
        Arr.add(c);
        // for(int i = 0 ; i < a.size() ; i++){
        //     System.err.print(a.get(i)+" ");
        // }
        for (int i = 0; i < Arr.size(); i++) {
            List<Integer> x = Arr.get(i);
            for (int j = 0; j< x.size();j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
        Arr.clear();
        Arr.add(c); 
            
           for (int i = 0; i < Arr.size(); i++) {
            List<Integer> x = Arr.get(i);
            for (int j = 0; j< x.size();j++) {
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
}
