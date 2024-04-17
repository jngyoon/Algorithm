class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        //직육면체 부피/주사위 부피
        // int boxV = box[0]*box[1]*box[2];
        // int diceV = n*n*n;
        // answer = boxV/diceV;
        // return answer;
       
        //각 면에 배치할 수 있는 주사위의 개수 중 
        //최소값이 최대로 배치할 수 있는 주사위의 개수
        int wn = box[0]/n;
        int hn = box[1]/n;
        int dn = box[2]/n;
        
        return wn*hn*dn;
    }
}