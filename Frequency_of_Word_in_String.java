import java.util.HashMap;

public class Frequency_of_Word_in_String {
    public static void main(String[] args) {
        String str = "programming is a fun fun is a programming";
        String [] str1 = str.split(" ");
        HashMap <String, Integer> map = new HashMap<>();
       
        for(String i : str1){
             map.put(i,map.getOrDefault(i, 0)+1);
    }
         System.out.println(map);
    }
}
