class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            int f = 1;
            
            //팩토리얼 값(f) 구하기
            for(int j=1; j<=i; j++){
                f *= j;    
            }
            //f가 n을 초과하면 반복문 종료
            if(f > n){
                break;
            }
            answer = i; //현재 i를 answer에 저장
        }
        
        return answer;
    }
}