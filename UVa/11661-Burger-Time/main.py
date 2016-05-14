import sys

inp = sys.stdin

while(1):
    n = int(inp.readline().strip())
    
    if n == 0:
        break
    
    line = list(inp.readline().strip())
    
    if 'Z' in line:
        print('0')
        continue
    
    prev = None
    curr = None
    prevIndex = 0
    least = 0
    
    for x in range(n):
        if line[x] == '.':
            continue
        if prev == None:
            prev = line[x]
            prevIndex = x
            continue
        if prev != line[x]:
            if least == 0 or x - prevIndex < least:
                least = x - prevIndex
        prev = line[x]
        prevIndex = x
    
    print(least)
    
