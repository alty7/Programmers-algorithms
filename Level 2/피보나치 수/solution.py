def fibonacci(num):
    a,b=0,1
    for i in range(num):
        a,b=b%1234567,(a+b)%1234567
    return a%1234567

def solution(n):
    return fibonacci(n)
