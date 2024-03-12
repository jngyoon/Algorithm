class Solution {
    public int[] solution(int n, int k) {
        int count = n/k; //배수의 갯수 구하기
        int[] answer = new int[count]; //갯수만큼 배열크기 지정
       
        
        for(int i=0; i<count; i++){
            answer[i] = i*k+k; //k의 배수 배열에 저장
        }
        return answer;
    }
}