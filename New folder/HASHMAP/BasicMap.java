
import java.util.HashMap;

public class BasicMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Prince", 2090);
        map.put("Raghav", 2060);
        map.put("Princess", 200);
        map.put("Raghavki", 60);
        // System.out.println(map);

        // System.out.println(map.containsKey("Prince"));
        // System.out.println(map.containsValue(2090));
        // System.out.println(map.size());
        // System.out.println(map.get("Prince")); 
        // System.out.println(map.get("kumar")); 
        // System.out.println(map);
        //for itrration
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println();
        for (Object pairs : map.entrySet()) {
            System.out.println(pairs);
        }
    }
}
