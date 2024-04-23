class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        // num을 문자열로 변환
        String numbers = String.valueOf(num);
        
        for(int i=0; i<numbers.length(); i++){
            //i번째 문자를 숫자로 가져와서 k의 숫자랑 같은지 비교
            if(numbers.charAt(i)-'0'==k){
                return i+1;
            }
          
        }
        
        return -1;
    }
}