def solution(n,a,b):
    answer = 0
    while a!=b:
        a= a%2==1 and (a+1)/2 or a/2 # 파이썬의 경우 '/' 연산의 결과가 정수가 아니다. 자바는 몫이지만 
        b= b%2==1 and (b+1)/2 or b/2
        answer+=1
    return answer
