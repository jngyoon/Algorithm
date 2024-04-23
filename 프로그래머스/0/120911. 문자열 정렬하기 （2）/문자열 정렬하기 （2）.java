import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String lowerString = my_string.toLowerCase();
        
        char[] charArray = lowerString.toCharArray();
        Arrays.sort(charArray);
        
        
        return new String(charArray);
    }
}