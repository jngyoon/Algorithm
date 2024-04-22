class Solution {
    public int[] solution(int n) {
        //약수의 개수 구하기
        int count = 0;   
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        
        //약수를 저장할 배열
        int[] answer = new int[count];
        int idx = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[idx] = i; 
                idx++;
            } 
        }
        
        return answer;
    }
}