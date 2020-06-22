import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
            } else {
                temp.add(arr[i]);
            }
        }
        int[] answer = new int[temp.size()];
        int size=0;
        for(int a : temp){
            answer[size++] = a;
        }
        return answer;
    }
}
