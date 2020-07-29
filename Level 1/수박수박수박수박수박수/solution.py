def solution(n):
    answer = ''
    for i in range(n):
        answer+= i%2==0 and '수' or '박'
    return answer
