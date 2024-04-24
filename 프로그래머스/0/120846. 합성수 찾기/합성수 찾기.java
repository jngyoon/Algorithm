class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            //for문 안에서 초기화하여 각 수마다 새로운 약수의 개수를 세게 함
            int count = 0;
            for(int j=1; j<=n; j++){
                if(i%j==0){
                    count++;
                }
                
            }
            if(count>=3){
                answer++;
                }
        }
        
        return answer;
    }
}