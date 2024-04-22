class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j"};
        
        while(age>0){
            //문자열을 역순으로 만들기 위해 뒤에 answer를 붙여줌
            answer = alpha[age%10]+answer;
            // 다음 자리로 이동하기 위해 나이를 10으로 나눔
            age /= 10;
        }
        
        return answer;
    }
}
// alpha[0] = a
// alpha[1] = b ...
// age = 23 -> 'age%10'=23/10의 나머지인 3  
//             'alpha[age%10]+answer' = alpha[3](=d)+"" = d -> answer = d
//             age = 20/10 = 2
//             'age%10'=2/10의 나머지 2
//             'alpha[age%10]+answer' = alpha[2](=c)+"d" = cd -> answer = cd
            