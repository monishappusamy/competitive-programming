import sys

inp = sys.stdin

t = int(inp.readline())
p = 0

for x in range(0, t):
    temp = inp.readline()
    val = []
    f = int(inp.readline())
    for y in range(0, f):
        l = [int(i) for i in inp.readline().split()]
        val.append(l[0]-l[1])
    if len(set(val)) > 1:
        print('no')
    else:
        print('yes')
    if x < t-1:
        print()
