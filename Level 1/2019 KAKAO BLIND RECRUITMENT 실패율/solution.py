def solution(N, stages):
    answer = []
    perc=[]
    i=1
    total=len(stages)
    while i<N+1:
        num=0
        if total==0:
            perc.append(1)
            i+=1
            continue
        num=stages.count(i)
        perc.append(1-num/total)
        total-=num
        i+=1
    while len(answer)<N:
        answer.append(perc.index(min(perc))+1)
        perc[perc.index(min(perc))]=2
    return answer
