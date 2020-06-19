class Solution {
    public boolean solution(int x) {
        int a=0;
        int b=x;
        while(b>0){
            a+=b%10; #일의자리수를 구해서 a에 더해준다.
            b/=10; #더해준 일의자리수를 버린다.
        }
        boolean answer = true;
        answer = (x%a==0) ? true : false; #삼항연산자. (조건)? 참이면 : 거짓이면;
        return answer;
    }
}
