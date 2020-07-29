class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i=0; i<answer.length; i++){
            answer[i]=0;
        }
        for(int i=heights.length-1; i>0; i--){
            if(answer[i]!=0){
                continue;
            } else {
                for(int j=i-1; j>=0; j--){
                    if(heights[j]>heights[i]){
                        for(int k=j+1; k<i+1; k++){
                            answer[k]=j+1;
                        }
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
