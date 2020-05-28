class Solution {
    public int[] solution(int[] answers) {
        int[] stu1={1,2,3,4,5};
        int[] stu2={2,1,2,3,2,4,2,5};
        int[] stu3={3,3,1,1,2,2,4,4,5,5};

        //채점
        int[] score={0,0,0};
        for(int j=0;j<3;j++){
            for(int i=0; i<answers.length; i++){
                if(answers[i]==stu1[i%5]){
                    score[0]++;
                }
            }
            for(int i=0; i<answers.length; i++){
                if(answers[i]==stu2[i%8]){
                    score[1]++;
                }
            }
            
            for(int i=0; i<answers.length; i++){
                if(answers[i]==stu3[i%10]){
                    score[2]++;
                }
            }
        }
        //
        int max=0;
        for(int i=0;i<3;i++){
            if(max<score[i]){
                max=score[i];
            }
        }
        int num=0;
        for(int i=0;i<3;i++){
            if(max==score[i]){
                num++;
            }
        }
        int[] answer=new int[num];
        int count=0;
        for(int i=0;i<3;i++){
            if(max==score[i]){
                answer[count]=i+1;
                count++;
            }
        }
        return answer;
    }
}
