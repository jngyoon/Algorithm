import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int n = numbers.length;
        
        answer = Math.max(numbers[0]*numbers[1], numbers[n-1]*numbers[n-2]);
        
        //처음 풀었던 방식 -> 음수값이 해결 안됐음
        // for(int i=0; i<numbers.length; i++){
        //     if(numbers[i]<0){
        //         answer = numbers[0]*numbers[1];
        //     }else{
        //         answer = numbers[n-1]*numbers[n-2];
        //     }    
        // }
        
         
        // 가장 작은 두 수와 가장 큰 두 수의 곱 중 큰 값을 선택합니다.
       
        
        
        return answer;
    }
}