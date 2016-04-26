import sys

inp = sys.stdin

n = int(inp.readline())

count = 1

for x in range(0, n):
    t = int(inp.readline())
    l = [int(i) for i in inp.readline().split()]
    
    high = 0
    low = 0
    
    for y in range(0, t-1):
        if l[y] > l[y+1]:
            low += 1
        elif l[y] < l[y+1]:
            high += 1
    
    print('Case {}: {} {}'.format(count, high, low))
    count += 1
    
    
