class Solution {
    public String solution(String s) {
        String answer="";
        s=s.toLowerCase(); // 전체 문자를 소문자로 통일하여 나중에 변환하는것을 없앰
        int count=0; //공백이 아닌 단어의 시작을 찾는 포인터 역할
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){ // 공백이 아닐때
                answer += (count%2==0) ? s.toUpperCase().charAt(i) : s.charAt(i);
                count++; // 단어 안에서 문자의 위치값 변경
            } else {
                answer += s.charAt(i); // 공백은 그냥 붙여준다
                count=0;
            }
        }
        return answer;
    }
}
