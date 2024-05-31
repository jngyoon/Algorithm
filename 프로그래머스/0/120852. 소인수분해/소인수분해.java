import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> factors = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            if(n%i==0){
                //더이상 안나눠질때까지 나눔
                while(n%i==0){
                    n/=i;
                }
                factors.add(i); //구한 소인수를 추가
            }    
        }
        //factors 리스트 값을 answer 배열에 넣어줌
        int[] answer = new int[factors.size()];
        for(int i=0; i<factors.size(); i++){
            answer[i] = factors.get(i);
        }
        
        return answer;
    }
}