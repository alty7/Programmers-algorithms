import heapq

def mix(a, b):
    return a + 2*b

def solution(scoville, K):
    answer=0
    heapq.heapify(scoville)

    while len(scoville)>=2:
        first=heapq.heappop(scoville)
        if first>=K:
            break
        second=heapq.heappop(scoville)

        heapq.heappush(scoville, mix(first,second))
        answer+=1
    
    if scoville[0]>=K:
        return answer
    else:
        return -1
