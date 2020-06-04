def solution(array, commands):
    answer = []
    for i in commands:
        a=i[0]
        b=i[1]
        c=i[2]
        ar=array[a-1:b]
        ar.sort()
        answer.append(ar[c-1])
    return answer
