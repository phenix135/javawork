package week3;

import java.util.HashMap;

//leedcode t290
public class demo3 {public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map    = new HashMap<>();
    String[] s1 = s.split(" ");
    if (s1.length!=pattern.length()){
        return false;
    }
    for (int i = 0; i < pattern.length(); i++) {
        if (!map.containsKey(pattern.charAt(i))){
            if (map.containsValue(s1[i])){
                return false;
            }
            map.put(pattern.charAt(i),s1[i]);
        }
        else {
            if (!map.get(pattern.charAt(i)).equals(s1[i])){
                return false;
            }
        }
    }
    return true;


}
}
