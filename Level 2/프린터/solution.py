def solution(priorities, location):
    answer = 0
    a=[(i,p) for i,p in enumerate(priorities)]
    while True:
        x=a.pop(0)
        if any(x[1]<y[1] for y in a):
            a.append(x)
        else:
            answer+=1
            if x[0]==location:
                return answer
