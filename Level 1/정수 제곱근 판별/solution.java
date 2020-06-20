class Solution {
    public long solution(long n) {
        long b = 1;
        long answer = 0;
        while(true){
            if(b*b==n){ //제곱수인가?
                answer=(b+1)*(b+1);
                break;
            } else if(b*b>n) { //제곱수가 없다면
                answer=-1;
                break;
            }
            b++;
        }
        return answer;
    }
}
