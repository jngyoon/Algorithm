import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //공백 기준으로 자른 s 배열에 담기
        String[] str = s.split(" ");
        int n = str.length;
        
        int[] numbers = new int[n];
        
        //배열값 정수로 변환
        for(int i=0; i<str.length; i++){
            numbers[i] = Integer.parseInt(str[i]); 
        }
        //배열 오름차순
        Arrays.sort(numbers);
        
        //최솟값, 최댓값 담기
        String min = Integer.toString(numbers[0]);
        String max = Integer.toString(numbers[n-1]);
        
        answer = min+" "+max;
        
        return answer;
    }
}