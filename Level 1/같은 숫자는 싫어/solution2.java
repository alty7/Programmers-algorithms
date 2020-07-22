public class Solution2 {
    public int[] solution(int []arr) {
        int newlen = arr.length;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                newlen--;
            }
        }
        int[] answer= new int[newlen];
        answer[0]=arr[0];
        int ind = 0;
        for(int i=1; i<arr.length; i++){
            if(answer[ind]!=arr[i]){
                answer[ind+1]=arr[i];
                ind++;
            }
        }
        return answer;
    }
}
