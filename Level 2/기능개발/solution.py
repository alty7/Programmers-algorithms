def solution(progresses, speeds):
    answer = []
    p=progresses
    while len(p):
        p=[b+c for b,c in zip(p,speeds)]
        print(p)
        count=0
        while len(p):
            if p[0]<100:
                break
            p.pop(0)
            speeds.pop(0)
            count+=1
        if count!=0:
            answer.append(count)
    return answer
