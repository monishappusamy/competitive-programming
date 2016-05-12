import sys
'''
Time limit exceeded
'''


inp = sys.stdin
count = 0

while(1):
    count += 1
    line = [int(i) for i in inp.readline().strip()]
    
    if not line:
        break
    
    n = int(inp.readline().strip())
    print('Case {}:'.format(count))
    
    for x in range(n):
        i, j = [int(i) for i in inp.readline().split()]
        
        if i > j:
            k = i
            i = j
            j = k
        
        if line[i:j+1].count(1) == j-i+1 or line[i:j+1].count(0) == j-i+1:
            print('Yes')
        else:
            print('No')
    
