class Solution {
    public int solution(int n) {
        int answer = 0;
        // Math.sqrt(n)
        double root = Math.sqrt(n);
        if(root%1==0){
            answer = 1;
        }else{
            answer = 2;
        }
        
        return answer;
    }
}