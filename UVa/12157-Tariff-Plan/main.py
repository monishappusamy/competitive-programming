import sys, math

inp = sys.stdin

t = int(inp.readline())
count = 0

for x in range(t):
    n = int(inp.readline())
    l = [int(i) for i in inp.readline().split()]
    
    mile = 0
    juice = 0
    
    for y in range(n):
        div = 0
        
        if l[y] % 30 == 0:
            div = 1
        div += math.ceil(l[y] / 30)
        mile += div * 10
        
        div = 0
        if l[y] % 60 == 0:
            div = 1
        div += math.ceil((l[y] / 60))
        if div == 0:
            div = 1
        juice += div * 15
    
    count += 1
    
    if mile == juice:
        print('Case {}: {} {} {}'.format(count, 'Mile', 'Juice', mile))
    elif mile < juice:
        print('Case {}: {} {}'.format(count, 'Mile', mile))
    else:
        print('Case {}: {} {}'.format(count, 'Juice', juice))
    
    
