class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = String.valueOf(order);
        
        for(int i=0; i<orderStr.length(); i++){
            char num = orderStr.charAt(i); 
            if(num=='3'||num=='6'||num=='9'){
                answer++;
            }
        }
    
        return answer;
    }
}