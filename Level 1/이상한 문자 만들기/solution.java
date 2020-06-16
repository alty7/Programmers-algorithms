class Solution {
    public String solution(String s) {
        String answer="";
        s=s.toLowerCase();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                answer += (count%2==0) ? s.toUpperCase().charAt(i) : s.charAt(i);
                count++;
            } else {
                answer += s.charAt(i);
                count=0;
            }
        }
        return answer;
    }
}
