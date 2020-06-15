import java.util.*; //array를 위한 import
class Solution {
    public long solution(long n) {
        int len = (int)(Math.log10(n)+1); // 입력된 숫자의 자릿수 크기
        long ar[] = new long[len];
        for(int i=0; i<len;i++){
            ar[i]=n%10;
            n/=10;
        }
        Arrays.sort(ar); //오름차순 정렬
        long answer = 0;
        for(int i=len; i>0; i--){ //숫자를 오름차순으로 정렬하였기 때문에 for문의 반복을 반대로해주었다.
            answer*=10;
            answer+=ar[i-1];    
        }
        return answer;
    }
}
