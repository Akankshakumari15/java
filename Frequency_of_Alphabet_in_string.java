import java.util.HashMap;

public class Frequency_of_Alphabet_in_string {
    public static void main(String[] args) {
        String str = "parallelogram";
        System.out.println("Frequency of each character:");
       // to count characters of a word
        HashMap <Character, Integer> map = new HashMap<>();
        char [] ch = str.toCharArray();
        for(char i:ch){
            
        map.put(i,map.getOrDefault(i, 0)+1);
    }
    System.out.println(map);

    //to print characters with one frequency
    System.out.println("Characters with one frequency:");
         map.forEach((key,value)->{
            if (value.equals(1)){
            System.out.println(key);

        }
    });

     //to print first character with one frequency
     System.out.println("First character with one frequency:");
    for(char i:map.keySet()){
        if(map.get(i)==1){
            System.out.println(i);
            break;
        }
    }
     // Characters with more than one frequency
     System.out.println("Characters with more than one frequency:");
    for(char i:map.keySet()){
        if(map.get(i)>1){
            System.out.println(i);
        }
    }

    }
}
 


         

