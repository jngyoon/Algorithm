class Solution {
    public int solution(int[] numbers, int k) {
        //현재 공을 던지는 사람의 인덱스
        int answer = 0;
        
        //k번째로 공을 받는 사람의 인덱스를 구하는 과정
        answer += numbers[2*(k-1)%numbers.length];
        
        //공을 던진 사람의 번호를 반환
        return answer;
    }
}