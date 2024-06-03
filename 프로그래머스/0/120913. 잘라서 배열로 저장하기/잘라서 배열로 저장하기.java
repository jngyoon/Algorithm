import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        //문자열을 저장할 리스트 생성
        List<String> answer = new ArrayList();
        
        //문자열을 n씩 잘라서 리스트에 저장
        for(int i=0; i<my_str.length(); i+=n){
            //길이가 n보다 작은 경우와 큰 경우 모두 고려하여 잘라서 리스트에 추가
            answer.add(my_str.substring(i, Math.min(i+n, my_str.length())));
        }
        //리스트를 배열로 변환        
        return answer.toArray(new String[0]);
    }
}