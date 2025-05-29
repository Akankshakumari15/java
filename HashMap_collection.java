import java.util.HashMap;

public class HashMap_collection {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 2);
        map.put("id2", 3);
        map.put("id3", 4);
        System.out.println(map.get("id1"));
        System.out.println(map.remove("id1",2));
        System.out.println(map);
        System.out.println(map.containsKey("id5"));
        System.out.println(map.containsValue(3));

        HashMap <Integer,Integer> map1 = new HashMap<>();
        map1.put(2, 1);
        map1.put(4, 2);
        map1.put(6, 3);
        map1.put(8, 4);
        System.out.println(map1);
        map1.forEach((key,value)->{
            if (value.equals(4)){
            System.out.println(key);

        }
    });
  }
}


