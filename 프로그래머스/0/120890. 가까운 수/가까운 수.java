import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDif = Integer.MAX_VALUE; //최소 차이를 저장할 변수
        
        //배열을 순회하면서 각 원소와 n의 차이를 계산하여 최소 차이를 찾음
        for(int i=0; i<array.length; i++){
            int dif = Math.abs(array[i]-n); //배열의 원소와 n의 차이의 절대값을 dif에 저장
            if(dif<minDif){                 
                minDif = dif;
                answer = array[i];
            }
            //차이가 최소차이와 같다면 answer와 배열의 원소값 중 작은것 리턴
            if (dif==minDif) {
                answer = Math.min(answer, array[i]);
            }
        }
        
        return answer;
    }
}