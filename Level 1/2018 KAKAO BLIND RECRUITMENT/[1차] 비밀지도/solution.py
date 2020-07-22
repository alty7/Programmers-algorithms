def solution(n, arr1, arr2):
    answer = []
    for i in range(n):
        line=""
        div=2**(n-1)
        while div>=1:
            a1=arr1[i]>=div and "#" or " "
            a2=arr2[i]>=div and "#" or " "
            # if a1==" " and a2==" ":
            #     line+=" "
            # else:
            #     line+="#"
            line+= a1==" " and a2==" " and " " or "#"
            
            arr1[i]-= arr1[i]>=div and div or 0
            arr2[i]-= arr2[i]>=div and div or 0
            div/=2
        answer.append(line)
    return answer
