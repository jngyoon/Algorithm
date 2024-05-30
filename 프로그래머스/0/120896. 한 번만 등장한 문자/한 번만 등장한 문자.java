import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //s를 split으로 분할
        String[] sArr = s.split("");
        //sArr 정렬
        Arrays.sort(sArr);
        
        //중복이 있으면 count++, 없으면 answer에 추가
        for(int i=0; i<sArr.length; i++){
            int count = 0;
            for(int j=0; j<sArr.length; j++){
                if(sArr[i].equals(sArr[j])){
                    count++;
                }
            }
            if(count==1){
                answer+=sArr[i];
            }
        }
        
        
        return answer;
    }
}