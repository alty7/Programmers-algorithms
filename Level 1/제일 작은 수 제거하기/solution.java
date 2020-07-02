import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] arr1 = new int[arr.length];
        if(arr.length<2){
            int[] answer = {-1};
            return answer;
        } else {
            for(int i=0; i<arr.length; i++){
                arr1[i]=arr[i];
            }
            Arrays.sort(arr1);
            int[] answer = new int[arr.length-1];
            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==arr1[0]){
                } else {
                    answer[count++]=arr[i];
                }
            }
            return answer;
        }
    }
}
