import sys

inp = sys.stdin
    
n = int(inp.readline())
 
for i in range(0, n):
    length = inp.readline()
    line = inp.readline()
    l = [int(x) for x in line.strip().split()]
    minimum = min(l)
    maximum = max(l)
    value = 2 * (maximum - minimum)
    print(value)
    
