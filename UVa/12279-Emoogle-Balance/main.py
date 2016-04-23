import sys

inp = sys.stdin

counter = 0
out = None

while(1):
    t = int(inp.readline())
    if t == 0:
        break
    c = [int(i) for i in inp.readline().strip().split()].count(0)
    t = t - c - c
    counter += 1
    print('Case {}: {}'.format(counter, t))
