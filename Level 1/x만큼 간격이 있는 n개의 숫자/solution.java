class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp=0; //int형으로 선언했을 때 제한조건에 의해 int로 표현할 수 있는 수의 범위를 초과하는 경우가 발생한다.
        for(int i=0; i<n; i++){
            tmp+=x;
            answer[i]=tmp;
        }
        return answer;
    }
}
