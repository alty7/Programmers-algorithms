class Solution {
    public int[] solution(int n, int m) {

        int gcd=0; // 최대공약수 초기화
        
        
        for(int i = 1; i<=Math.max(n, m); i++){
            if(Math.min(n,m)/i<1){
                break;
            }
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        int lcm=n*m/gcd; //
        
        int[] answer = {gcd, lcm};
        return answer;
    }
}
