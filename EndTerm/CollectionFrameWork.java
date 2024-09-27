
import java.util.*;

public class CollectionFrameWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> str = new ArrayList<>();
        str.add(0);
        str.add(1);
        str.add(2);
        str.add(3);
        str.add(0);
        str.add(4,4);
        System.out.println(str);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(6);
        newList.add(5);
        str.addAll(newList);
        System.err.println(str);
        System.out.println(str.get(1 ));
        System.out.println(str.remove(6));
        System.out.println(str.contains(5));
        str.clear();
        System.out.println(str);

    }
}
