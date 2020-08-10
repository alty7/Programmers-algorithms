import java.util.*;
class Solution {
    public int solution(String dartResult) {
        StringTokenizer cal = new StringTokenizer(dartResult,"SDT*#",true);
        int[] score={0,0,0};
        int ind=0;
        String m="SDT";
        while(cal.hasMoreTokens()){
            String s=cal.nextToken();
            try {
                score[ind]=Integer.parseInt(s);
                ind++;
            } catch (Exception e) {
                int tmp=score[ind-1];
                if(s.equals("S")||s.equals("D")||s.equals("T")){
                    for(int i=0; i<m.indexOf(s);i++){
                        score[ind-1]*=tmp;
                    }
                } else if(s.equals("*")){
                    score[ind-1]*=2;
                    if(ind>1){
                        score[ind-2]*=2;
                    }
                } else if(s.equals("#")){
                    score[ind-1]*=-1;
                }
            }
        }
        int answer=0;
        for(int i : score){
            answer+=i;
        }
        return answer;
    }
}
