def solution(phone_number):
    answer = ''
    count=0
    for s in phone_number:
        answer+='*' if count < len(phone_number)-4 else s
        count+=1
    return answer
