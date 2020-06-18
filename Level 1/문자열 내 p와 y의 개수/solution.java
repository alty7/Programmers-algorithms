class Solution {
    boolean solution(String s) {
        s=s.toUpperCase();
        int check=0;
        boolean answer = true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='P'){
                check++;
            } else if(s.charAt(i)=='Y'){
                check--;
            }
        }
        if(check!=0){
            answer=false;
        }
        return answer;
    }
}
