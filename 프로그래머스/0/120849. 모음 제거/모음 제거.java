class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : my_string.toCharArray()){
            if("aeiou".indexOf(c) == -1){
                answer = sb.append(c).toString();
            }
                
        }
        return answer;
    }    
}