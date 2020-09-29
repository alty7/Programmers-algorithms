def solution(number, k):
    number=str(number)

    while k>0:
        for i in range(len(number)):
            if i==len(number)-1:
                number=number[:i]
                k-=1
                break
            if number[i]==9:
                continue
            if number[i]<number[i+1]:
                number=number[:i]+number[i+1:]
                k-=1
                break
    return number
