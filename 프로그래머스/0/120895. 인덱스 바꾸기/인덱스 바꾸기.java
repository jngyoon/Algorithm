class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split(""); //my_string의 문자열을 공백 문자("")를 기준으로 분리하여 문자열 배열 arr에 저장
        
        String temp = arr[num1]; // num1 인덱스의 문자를 temp 변수에 저장
        arr[num1] = arr[num2];
        arr[num2] = temp;
        answer = String.join("", arr); //문자열 배열 arr의 각 요소를 빈 문자열("")을 구분자로 사용하여 하나의 문자열로 연결
        
        return answer;
    }
}