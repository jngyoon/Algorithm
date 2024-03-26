class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(); 
        
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);  //my_string 문자열을 charAt로 인덱스에 해당하는 문자를 ch에 담음
                for(int j=0; j<n; j++){
                    sb.append(ch);   //ch에 담은 문자를 n번 반복해서 sb에 추가
                 }
            
        }
        
        return sb.toString();   //sb String형으로 변환
    }
}