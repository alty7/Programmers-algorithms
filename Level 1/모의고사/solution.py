def solution(answers):
    score = [0,0,0]
    a=[1,2,3,4,5]
    b=[2,1,2,3,2,4,2,5]
    c=[3,3,1,1,2,2,4,4,5,5]
    for i in range(len(answers)):
        score[0] = answers[i]==a[i%5] and score[0]+1 or score[0]
        score[1] = answers[i]==b[i%8] and score[1]+1 or score[1]
        score[2] = answers[i]==c[i%10] and score[2]+1 or score[2]
    
    answer=[]
    for i in range(3):
        if score[i]==max(score):
            answer.append(i+1)
    return answer
