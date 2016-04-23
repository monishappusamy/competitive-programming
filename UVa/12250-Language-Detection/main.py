import sys
from collections import Counter

inp = sys.stdin

t = int(inp.readline())
one = ['o', 'n', 'e']

for i in range(0, t):
    c = inp.readline().strip()
    
    if len(c) == 5:
        print('3')
    elif len(set(one) & set(list(c))) > 1:
        print('1')
    else:
        print('2')
