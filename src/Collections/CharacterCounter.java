package Collections;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        String str = "hello world@@@@(())%%$$";
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Counting repetitive characters
        for (char ch : str.toCharArray()) {
        	if(!(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'))
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        
        // Printing character counts
        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
