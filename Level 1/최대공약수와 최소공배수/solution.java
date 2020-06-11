class Solution {
    public int[] solution(int n, int m) {

        int gcd=0; // 최대공약수 초기화
        
        
        for(int i = 1; i<=Math.min(n, m); i++){
//             if(Math.min(n,m)/i<1){
//                 break;
//             } // i의 범위를 min으로 설정해주어서 존재할 이유가 없어짐.
            if(n%i==0 && m%i==0){
                gcd=i;
            }
        }
        int lcm=n*m/gcd; // 최소공배수
        
        int[] answer = {gcd, lcm};
        return answer;
    }
}
