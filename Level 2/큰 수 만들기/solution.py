def solution(number, k):
    answer=''
    number=str(number)
    ln=len(number)
    la=ln - k
    ind=-1
    for i in range(la):
        val = "0"
        for j in range(ind+1, ln-(la-len(answer))+1):

            if val < number[j]:
                ind = j
                val = number[j]
                if val == "9":
                    break
        answer+=val
    return answer
