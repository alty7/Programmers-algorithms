class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            int a = s.charAt(i);
            if(a!=' '){
                a = (Character.isUpperCase(a)) ? (a-65+n)%26+65 : (a-97+n)%26+97; // 대소문자 구분하여 아스키변환
            }
            answer+= Character.toString((char)a);
        }
        return answer;
    }
}
