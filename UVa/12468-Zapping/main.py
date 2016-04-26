import sys

inp = sys.stdin

while(1):
    l = [int(i) for i in inp.readline().split()]
    if l[0] == -1 and l[1] == -1:
        break
    
    if l[0] == l[1]:
        print(0)
        continue
    
    forward = abs(l[0] - l[1])
    reverse = (100 - max(l[0], l[1])) + min(l[0], l[1])
    
    if forward < reverse:
        print(forward)
    else:
        print(reverse)
    
