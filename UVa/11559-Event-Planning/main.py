import sys

inp = sys.stdin

while(1):
    
    l = [int(i) for i in inp.readline().split()]
    
    try:
        person, budget, hotel, weeks = l[0], l[1], l[2], l[3]
    except:
        break
    
    curr = None
    flag = False
    
    for x in range(0, hotel):
        price = int(inp.readline())
        availablity = [int(i) for i in inp.readline().split()]
        
        if max(availablity) < person:
            continue
        elif (person * price) > budget:
            continue
        else:
            if curr == None:
                curr = person * price
            elif person * price < curr:
                curr = person * price
            flag = True
    
    if flag == False:
        print('stay home')
    else:
        print(curr)
