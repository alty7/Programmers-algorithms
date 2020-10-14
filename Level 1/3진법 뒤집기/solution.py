def solution(n):
    n3=''

    while n>0:
        n3+=str(n%3)
        n=n//3

    answer=0
    for i in n3:
        answer*=3
        answer+=int(i)

    return answer
