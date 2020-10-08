from itertools import permutations
import math

def solution(numbers):
    answer = []
    for i in range(1, len(numbers)+1):
        nlist = list(map(''.join, permutations(list(numbers), i))) #permutations:순열
        for j in list(set(nlist)):
            j=int(j)
            check=True
            
            if j<2:
                check=False
            else:
                for k in range(2, int(math.sqrt(j))+1):
                    if j%k==0:
                        check=False
                        break
            
            if check:    
                answer.append(j)
    
    return len(set(answer))
