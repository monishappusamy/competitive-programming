import sys, math

inp = sys.stdin

t = int(inp.readline())
count = 0

for x in range(t):
    n = int(inp.readline())
    history = []
    position = 0
    
    for y in range(n):
        direction = None
        i = 0
        l = inp.readline().split()
        if len(l) == 1:
            direction = l[0]
        else:
            i = int(l[2])
            direction = history[i-1]
        
        history.append(direction)
        
        if direction == 'LEFT':
            position -= 1
        else:
            position += 1
        
    print(position)
    
