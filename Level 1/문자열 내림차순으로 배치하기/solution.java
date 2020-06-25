class Solution {
  public String solution(String s) {
      String answer = "";
      char[] c=s.toCharArray();
      for(int i=0; i<c.length; i++){
          for(int j=i; j<c.length; j++){
               if(c[i]<c[j]){
                   char temp=c[i];
                   c[i]=c[j];
                   c[j]=temp;
               }
          }
      }
      answer=String.valueOf(c);
      return answer;
  }
}
