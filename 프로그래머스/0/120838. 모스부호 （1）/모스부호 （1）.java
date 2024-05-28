class Solution {
    public String solution(String letter) {
        String answer = "";
        
        //문제에서 제공한 a~z 순서대로 담긴 모스부호 배열
        String[] morseArr ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        //letter를 공백으로 split
        String[] morse = letter.split(" ");
        
        for(String s:morse){
            for(int i=0; i<morseArr.length; i++){
                //s의 문자열과 morseArr의 문자열이 같은지 확인
                if(s.equals(morseArr[i])){
                    answer += Character.toString(i+'a'); //같으면 answer에 인덱스를 문자열로 변환해서 추가
                }
            }
        }
        return answer;
    }
}