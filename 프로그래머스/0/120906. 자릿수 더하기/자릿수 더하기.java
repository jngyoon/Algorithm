class Solution {
    public int solution(int n) {
        int answer = 0;
        
//         String[] nStr = String.valueOf(n).split("");
        
//         int[] num = new int[nStr.length];
//         for(int i=0; i<num.length; i++){
//             num[i] = Integer.parseInt(nStr[i]);
//         }
        
//         for(int i=0; i<num.length; i++){
//             answer += num[i];
//         }
//         return answer;
        
        String str = Integer.toString(n);
        String[] nStr = str.split("");
        
        for(int i=0; i<nStr.length; i++){
            answer += Integer.parseInt(nStr[i]);
        }
        return answer;
        
    }
}