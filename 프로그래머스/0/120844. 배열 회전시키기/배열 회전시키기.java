class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            // 배열을 오른쪽으로 한 칸씩 이동시키는 과정
            for(int i=0; i<answer.length-1; i++){
                answer[i+1]=numbers[i];
            }
            // 맨 마지막 요소를 맨 앞으로 이동시킴
            answer[0] = numbers[numbers.length-1];
        }else{
            // 배열을 왼쪽으로 한 칸씩 이동시키는 과정
            for(int i=0; i<answer.length-1; i++){
                answer[i]=numbers[i+1];
            }
            // 맨 앞 요소를 맨 뒤로 이동시킴
            answer[answer.length-1]=numbers[0];
        }
        return answer;
    }
}