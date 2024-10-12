import java.util.TreeMap;

public class Basic {

    public static void main(String[] args) {
        TreeMap<String, Integer> tree = new TreeMap<>();
        tree.put("Prince", 70);
        tree.put("mayank", 290);

        for (String key : tree.keySet()) {
            System.out.println(key + " " + tree.get(key));
        }
    }
}
