### 테케 5,8 / 효율성 실패
def solution(prices):
    answer = []
    stack=[]
    while len(prices):
        stack.append(prices.pop(0))
        count=0
        for p in prices:
            count+=1
            if stack[-1]<=p:
                pass
            else:
                answer.append(count)
                break
        if count==len(prices):
            answer.append(count)

    return answer

### 효율성 실패
def solution(prices):
    answer = []
    stack=[]
    while len(prices):
        stack.append(prices.pop(0))
        count=0
        check=0
        for p in prices:
            count+=1
            if stack[-1]>p:
                answer.append(count)
                check+=1
                break
        if check==0:
            answer.append(count)

    return answer
