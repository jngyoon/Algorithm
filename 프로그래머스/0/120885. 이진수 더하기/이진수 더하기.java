class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        //이진수 String 문자열을 int형 이진수 값으로 변환(더하기 위해)
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int result = num1+num2;
        
        //int형 이진수를 String형 이진수로 변환
        answer = Integer.toBinaryString(result);
        
        return answer;
    }
}