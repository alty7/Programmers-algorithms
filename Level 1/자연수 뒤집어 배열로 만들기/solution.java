class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");

        int[] answer = new int[arr.length];
        int j = 0;
        for(int i =arr.length-1 ; i>=0; i--){
            answer[j] = Integer.parseInt(arr[i]);
            j++;
        }
        return answer;
    }
}
