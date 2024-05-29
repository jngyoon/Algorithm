class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        //i~j까지의 숫자를 String형으로 변환 
        for(int num=i; num<=j; num++){
            String strNum = String.valueOf(num);
            //strNum 인덱스의 문자를 숫자로 변환한게 k와 같은게 있으면 answer 증가 
            for(int idx=0; idx<strNum.length(); idx++){
                if(strNum.charAt(idx)-'0' == k){
                    answer++;
                }
            }
        }

        return answer;
    }
}