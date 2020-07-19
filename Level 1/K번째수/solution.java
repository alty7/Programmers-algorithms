import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int size = commands[i][1] - commands[i][0] + 1;
            int ind = commands[i][0]-1;
            int k = commands[i][2]-1;
            int[] cut = new int[size];
            for(int j=0; j<size; j++){
                cut[j]=array[ind++];
            }
            Arrays.sort(cut);
            answer[i]=cut[k];
        }
        return answer;
    }
}
