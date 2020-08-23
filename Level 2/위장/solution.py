def solution(clothes):
    answer = 1

    a={}
    for i in clothes:
        if i[1] not in a.keys():
            a[i[1]]=1
        else:
            a[i[1]]+=1

    for i in a.keys():
        answer*=a[i]+1
    
    return answer-1
