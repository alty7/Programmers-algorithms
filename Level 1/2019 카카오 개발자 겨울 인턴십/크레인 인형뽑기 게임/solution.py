def solution(board, moves):
    answer = 0
    case=[]
    for m in moves:
        m-=1
        for i in board:
            if i[m]!=0:
                case.append(i[m])
                i[m]=0
                break
        if len(case)>1 and case[-2]==case[-1]:
            case.pop()
            case.pop()
            answer+=2
    return answer
