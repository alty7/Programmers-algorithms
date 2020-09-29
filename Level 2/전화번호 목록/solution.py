def solution(pb):
    
    pb.sort()
    for i in range(len(pb)):
        for j in range(i+1,len(pb)):
            if len(pb[i])<=len(pb[j]):
                if pb[j][:len(pb[i])]==pb[i]:
                    return False
    return True
