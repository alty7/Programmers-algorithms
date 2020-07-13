class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left =9; // *
        int right=11; // #
        int temp=0; // 입력할 숫자를 담는 변수
        for(int i=0; i<numbers.length; i++){
            // 012 345 678 식의 좌표로 변환
            temp = numbers[i]==0 ? 10 : numbers[i]-1;
            switch(temp%3){ // 눌러야 할 숫자의 위치로 나누기
                case 0: // 1 4 7 일 경우
                    left=temp;
                    answer+="L";
                    break;
                case 1: // 2 5 8 0 일 경우, 거리계산
                    int dist_l = Math.abs(left/3-temp/3)+Math.abs(left%3-temp%3);
                    int dist_r = Math.abs(right/3-temp/3)+Math.abs(right%3-temp%3);
                    if(dist_l < dist_r){ // 왼손이 더 가까울 때
                        left=temp;
                        answer+="L";
                    } else if(dist_l > dist_r){ // 오른손이 더 가까울 때
                        right=temp;
                        answer+="R";
                    } else if(dist_l==dist_r){ // 같은 거리면 어느손?
                        if(hand.equals("left")){ // 왼손잡이
                            left=temp;
                            answer+="L";
                        } else { // 오른손잡이
                            right=temp;
                            answer+="R";
                        }
                    }
                    break;
                case 2: // 3 6 9 일 경우
                    right=temp;
                    answer+="R";
                    break;
            }
        }
        return answer;
    }
}
