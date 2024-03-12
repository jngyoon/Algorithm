class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        //홀수번째는 대문자, 짝수번째는 소문자
        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
                answer[i] = strArr[i].toLowerCase();
            }else{
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}