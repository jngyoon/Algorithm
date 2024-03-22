class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; //배열 초기화
       
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0] ++;  //짝수 갯수 증가  
            }else{
                answer[1] ++;   //홀수 갯수 증가
            }
            
        }
        return answer;
    }
}