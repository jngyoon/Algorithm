class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        //replaceAll로 [^0-9]에 해당하는 문자열을 공백으로 대체(숫자를 제외한 모든 문자를 공백으로 대체)
        //후 공백을 기준으로 split
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        
        for(String s : str){
            //s의 각 문자열이 빈 문자열이 아니라면 s의 문자열을 정수형으로 변환해서 answer에 더함
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}