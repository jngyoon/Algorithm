class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int index = 0;  //num_list 원소 가져올때 사용할 index
        for(int i=0; i<num_list.length/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[index++]; //index
            }
        }
        
        return answer;
    }
}