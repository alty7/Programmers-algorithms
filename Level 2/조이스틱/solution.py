def solution(name):
    answer = 0
    index=0
    counts=[]
    for n in name:
        if ord(n)<78:
            counts.append(ord(n)-ord('A'))
        else:
            counts.append(ord('Z')-ord(n)+1)
            
    while True:
        
        answer+=counts[index]
        counts[index]=0
        
        if sum(counts)==0:
            break
            
        l,r=1,1
        while counts[index-l]==0:
            l+=1
            
        while counts[index+r]==0:
            r+=1
            
        if l<r:
            answer+=l
            index-=l
        else:
            answer+=r
            index+=r
        
    
    return answer
