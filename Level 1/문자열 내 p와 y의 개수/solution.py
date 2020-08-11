def solution(s):
    answer = 0
    for i in s:
        if i in ('p','P'):
            answer+=1
        elif i in ('y','Y'):
            answer-=1
    return answer==0
