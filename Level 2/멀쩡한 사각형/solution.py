import math
def solution(w,h):
    q=0
    a=max(w,h)
    b=min(w,h)
    if w!=h:
        for i in range(b):
            q+=math.ceil(a*(i+1)/b)-math.floor(a*i/b)
    else:
        q=b
    return w*h - q
