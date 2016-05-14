import sys

inp = sys.stdin
n = int(inp.readline().strip())

for x in range(n):
    line = str(inp.readline().strip())
    line = line.replace(' ', '')
    if len(line) == 2:
        print('NO LOOP')
    elif line.count('M') == line.count('F'):
        print('LOOP')
    else:
        print('NO LOOP')
