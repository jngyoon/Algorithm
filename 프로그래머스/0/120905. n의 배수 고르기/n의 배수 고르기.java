import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        //answer 배열 길이 구하기
        int count = 0;
        for(int num : numlist){
            if(num%n==0){
                count++;
            }
        }
        int[] answer = new int[count];
        
        // numlist 배열에서 n의 배수만 골라내서 answer 배열에 넣을 때는 
        // answer 배열의 인덱스를 따로 관리해야 합니다. 
        int j = 0;  
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                answer[j]=numlist[i];
                j++; // 배열에 값을 저장하면서 동시에 다음 위치에 값을 저장할 준비
            }    
        }
        
        
        return answer;
    }
}