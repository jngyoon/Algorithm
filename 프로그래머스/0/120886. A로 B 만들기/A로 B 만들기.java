import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        //문자열을 char형 배열로 변환
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        //배열 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        //배열을 문자열로 변환
        String str1 = new String(arr1);
        String str2 = new String(arr2);
        
        return str1.equals(str2) ? 1:0;
         
        
    }
}