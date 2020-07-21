def solution(n, words):
    answer = [0,0]
    a,b=1,1
    last=words[0]

    for w in words:
        if a==1 and b==1:
            a+=1
            continue
        
        if last[-1]!=w[0]:
            answer=[a,b]
            print(2)
            break
        elif words.count(w)>1:
            t=words.index(w,words.index(w)+1)
            
            while t>=n:
                t-=n
                answer[1]+=1
            answer[0]=t+1
            answer[1]+=1
            break
        else:
            last=w
            b= a==n and b+1 or b
            a= a==n and 1 or a+1
            print(1)
        
    return answer
