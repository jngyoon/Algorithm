class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        //
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]<emergency[j]){
                   answer[i]++;     //emergency[i] 보다 응급도가 높은 환자의 수 세기
                }    
            }answer[i]++;   //순서를 0이 아니라 1부터 나타내야하기 때문에 1씩 증가
            
        }
        
        return answer;
    }
}