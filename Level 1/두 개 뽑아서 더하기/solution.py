def solution(numbers):
    answer = []
    l=len(numbers)
    for i in range(l-1):
        for j in range(i+1,l):
            answer.append(numbers[i]+numbers[j])
    answer=list(set(answer)) #set을 한다고 항상 오름차순 정렬이 되지 않는다.
    answer.sort()
    return answer
