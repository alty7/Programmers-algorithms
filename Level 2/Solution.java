import java.util.*;
class Solution {
    public int[] solution(final int[] progresses, final int[] speeds) {
        ArrayList<Integer> a = new ArrayList<>();
        int sind=0;
        while(sind<speeds.length){
            for(int i=sind; i<speeds.length; i++){
                progresses[i]+=speeds[i];
            }
            int count=0;
            for(;sind<speeds.length;sind++){
                if(progresses[sind]<100){
                    break;
                }
                count++;
            }
            if(count!=0){
                a.add(count);
            }
        }
        int[] answer = new int[a.size()];
        int tmp=0;
        for(int i : a){
            answer[tmp++]=i;
        }
        return answer;
    }
}
