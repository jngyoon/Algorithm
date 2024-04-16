import java.util.*;

class Solution {
    public int[] solution(String my_string) {
       
        // 숫자를 저장할 리스트 생성
        List<Integer> numberList = new ArrayList<>();
    
        // 주어진 문자열을 순회하면서 숫자를 추출하여 리스트에 추가
        for(char c : my_string.toCharArray()){           
            if(Character.isDigit(c)){
                numberList.add(Character.getNumericValue(c)); // char를 int로 변환하여 리스트에 추가
            }
        }
        
        //리스트를 배열로 변환
        int[] answer = new int[numberList.size()];
        for(int i=0; i<numberList.size(); i++){
            answer[i] = numberList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}