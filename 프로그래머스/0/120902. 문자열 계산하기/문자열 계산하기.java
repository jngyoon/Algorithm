class Solution {
    public int solution(String my_string) {
        
        //공백을 기준으로 문자열 split한 후 배열 생성
        String[] arr = my_string.split(" ");
        
        //arr[0]의 문자열을 정수로 변환
        int answer = Integer.valueOf(arr[0]);
        
        //arr[1]이 +인지 -인지에 따라 arr[2]를 정수로 변환한 값을 더하거나 빼기
        for(int i=1; i<arr.length; i++){
            if(arr[i].equals("+")){
                answer += Integer.valueOf(arr[i+1]);
            }else if(arr[i].equals("-")){
                answer -= Integer.valueOf(arr[i+1]);
            }
        }
        
        
        return answer;
    }
}