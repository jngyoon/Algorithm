class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();

         for (char c : my_string.toCharArray()) {   //문자열을 문자 배열로 변환해서 c에 담기
            if (sb.indexOf(String.valueOf(c)) == -1) {  //c의 값을 string으로 변환해서 sb에 문자 c가 이미 있는지 확인
                
                sb.append(c);  //sb에 문자 c 추가
                
                }
            }
            answer =  sb.toString();

        
        return answer;
    }
}