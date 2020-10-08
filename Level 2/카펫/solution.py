import math

def solution(b, y):
    term = math.sqrt((b+4)**2 /4 - 4 * (b + y))
    w = ((b + 4) / 2 + term) / 2
    h = ((b + 4) / 2 - term) / 2
    return [w,h]
