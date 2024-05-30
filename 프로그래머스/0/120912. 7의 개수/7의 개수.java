import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        //정수형 배열을 스트링형으로 변환
        String str = Arrays.toString(array);
        
        for(int i=0;i<str.length(); i++){
            if(str.charAt(i) == '7'){        //문자열의 인덱스 i에 위치한 문자가 7인지 확인
                answer++;
            }
        }
        
        return answer;
    }
}