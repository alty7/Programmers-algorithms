class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 학생 명단, 갯수 생성
        int all[]=new int[n];
        for(int i=0; i<n; i++){
            all[i]=1;
        } // java.util.Arrays; Arrays.fill(all,1);
        
        // 도난
        for(int i=0; i<lost.length; i++){
            all[lost[i]-1]--;
        }
        
        // 여벌
        for(int i=0; i<reserve.length; i++){
            all[reserve[i]-1]++;
        }
        
        // 빌려주기
        for(int i=1; i<all.length; i++){
            if(all[i-1]+all[i]==2){
            all[i-1]=1;
            all[i]=1;
            }
        }
        
        // 학생 수 세기
        for(int i=0; i<all.length; i++){
            if(all[i]!=0){
                answer++;
            }
        }
        return answer;
    }
}
