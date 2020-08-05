class Solution {
    public String solution(int n) {
        String answer = "";
        while(n>0){
            String a=Integer.toString((n-1)%3+1);
            answer= a.equals("3") ? "4"+answer : a+answer;
            n=(n-1)/3;
        }
        return answer;
    }
}
