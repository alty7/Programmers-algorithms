def solution(num):
    answer = ''
    if num%2==0:
        answer='Even'
    else:
        answer='Odd'
    return answer

def solution2(num):
    return 'Odd' if (num%2) else 'Even'
