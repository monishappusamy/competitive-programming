import sys

inp = sys.stdin

while(1):
    l = [int(i) for i in inp.readline().split()]
    b, n = l[0], l[1]
    
    if b == 0 and n == 0:
        break
    
    dict = {}
    
    r = [int(i) for i in inp.readline().split()]
    
    for x in range (1, b+1):
        dict[x] = r[x-1]
    
    for y in range (0, n):
        l = [int(i) for i in inp.readline().split()]
        
        debtor, creditor, val = l[0], l[1], l[2]
        

        dict[debtor] -= val
        dict[creditor] += val
    
    flag = True
    
    for x in range (1, b+1):
        if dict[x] < 0:
            flag = False
    
    if flag:
        print('S')
    else:
        print('N')
    
