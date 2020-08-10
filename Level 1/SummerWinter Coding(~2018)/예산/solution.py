def solution(d, budget):
    answer = 0
    sum = 0
    d.sort()
    for i in d:
        if sum+i>budget:
            break
        else:
            sum+=i
            answer+=1
    return answer
