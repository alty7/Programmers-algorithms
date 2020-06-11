class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int l = phone_number.length();
        for(int p=0; p<l-4; p++){
            answer+="*";
        } //여기서 for문 대신 String의 repeat 메소드를 사용하면 조금 더 깔끔해질 수 있다.
        answer+=phone_number.substring(l-4);
        return answer;
    }
}
