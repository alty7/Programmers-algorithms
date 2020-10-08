def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge=[]
    s=0
    while True:
        answer+=1
        
        if len(bridge)!=0 and bridge[0][1]==bridge_length:
            s-=bridge[0][0]
            bridge.pop(0)
        
        if len(bridge)|len(truck_weights)==0:
            return answer
        
        if len(truck_weights)!=0 and (s+truck_weights[0])<=weight and len(bridge)<bridge_length:
            s+=truck_weights[0]
            bridge.append([truck_weights.pop(0),0])
        
        for t in bridge:
            t[1]+=1
