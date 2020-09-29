def solution(numbers):
    answer = ''
    n=[(str(i)*4,str(i)) for i in numbers]
    n.sort(reverse=True)
    for a in n:
        answer+=a[1]
    if answer[0]=='0':
        return '0'
    return answer
