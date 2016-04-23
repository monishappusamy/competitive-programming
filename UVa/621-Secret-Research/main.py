import sys
from collections import Counter

inp = sys.stdin

t = int(inp.readline())

for i in range(0, t):
    S = int(inp.readline())
    
    l = list(str(S))
    
    if S == 1 or S == 4 or S == 78:
        print('+')
    elif l[-1] == '5' and l[-2] == '3':
        print('-')
    elif l[0] == '9' and l[-1] == '4':
        print('*')
    else:
        print('?')
