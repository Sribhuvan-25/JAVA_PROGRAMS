package HashTables;
import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
   public char fFNRC(String str){                    // findFirstNonRepeatingCharacter (fFNRC)
     Map<Character, Integer> map = new HashMap<>();
         for(var cha : str.toCharArray()) {
             var count = map.containsKey(cha) ? map.get(cha) : 0;
             map.put(cha, count + 1);
         }
         System.out.print(map);

     for(var ch : str.toCharArray()){
         if(map.get(ch)==1){
             return ch;
         }
     }
     return Character.MIN_VALUE;
   }
}
