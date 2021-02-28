package HashTables;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public char findFirstRepeatedCharacter(String str){
        Set<Character> set = new HashSet<>();
        for(var ch : str.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
