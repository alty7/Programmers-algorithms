def solution(arr1, arr2):
    answer = []

    newarr2=[]
    for i in range(len(arr2[0])):
        tmp=[]
        for j in range(len(arr2)):
            tmp.append(arr2[j][i])
        newarr2.append(tmp)
    
    for row1 in arr1:
        rows=[]
        for row2 in newarr2:
            t=0
            for l in range(len(row2)):
                t+=row1[l]*row2[l]
            rows.append(t)
        answer.append(rows)

    return answer
