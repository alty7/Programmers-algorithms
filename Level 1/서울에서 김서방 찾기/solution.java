class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        // int index=0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){ // String type 비교시 '=='를 쓰지 않는다
                // index=i;
                answer+=i;
                break;
            }
        }
        // answer+=index;
        answer+="에 있다";
        return answer;
    }
}
