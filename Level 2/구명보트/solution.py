def solution(p, l):
    answer = 0
    p.sort()
    fi=0
    ei=len(p)-1

    while fi<=ei:
        if p[ei]+p[fi]>l:
            ei-=1
        else:
            ei-=1
            fi+=1
        answer+=1
        
    return answer
