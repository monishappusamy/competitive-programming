import sys

inp = sys.stdin
l = 1

def find_sum(number):
    number = str(number)
    total = 0
    for x in range(0, len(number)):
        total += int(number[x])
    if len(str(total)) == 1:
        return total
    else:
        tot = find_sum(total)
    return tot

while(1):
    l = int(inp.readline())
    if (l == 0):
        break
    print(find_sum(l))
