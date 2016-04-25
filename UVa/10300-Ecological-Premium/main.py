import sys

inp = sys.stdin

t = int(inp.readline())

for x in range(0, t):
    p = 0
    f = int(inp.readline())
    for y in range(0, f):
        l = [int(i) for i in inp.readline().split()]
        p += l[0] * l[2]
    print(p)
