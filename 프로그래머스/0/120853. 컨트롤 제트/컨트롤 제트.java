class Solution {
    public int solution(String s) {
        int answer = 0;
        int prevNum = 0; // 이전에 더한 숫자를 저장할 변수
        
        //문자열을 공백을 기준으로 split 후 배열로 저장
        String[] sArr = s.split(" ");
        
        for(String str : sArr){
            if(str.equals("Z")){
                answer -= prevNum;
            }else{
                int num = Integer.parseInt(str);
                answer += num;
                prevNum = num; //이전에 더한 숫자를 업데이트
            }
        }
        
        return answer;
    }
}