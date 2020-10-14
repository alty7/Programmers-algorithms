def solution(n):
    answer = []
    ind1=-1
    ind2=0

    # tem=[[0]*n]*n
    tem=[[0] * n for _ in range(n)]
    num=1
    print(tem)
    for i in range(n):
        for j in range(i,n):
            if i%3==0 :#left
                ind1+=1

            elif i%3==1 :#down
                ind2+=1

            elif i%3==2 :#right
                ind1-=1
                ind2-=1
            tem[ind1][ind2]=num
            num+=1
            
    print(tem)
    for t in tem:
        for u in t:
            if u!=0: answer.append(u)
        
    return answer
