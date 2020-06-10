class Solution {
    public String solution(int num) {
        String answer = "Odd";
        if (num%2==0){ // 조건을 바꿔서 홀수를 찾는 경우 num%2==1 이외에 -1도 존재하기때문에 '0일때 짝수이다'를 쓰는게 좋다
            answer="Even";
        }
        return answer;
    }
}
