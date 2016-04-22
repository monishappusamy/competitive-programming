import sys

inp = sys.stdin
x=0
    
def clockwise(current, new):
    sum = 0
    if new > current:
        sum = current + 360 - new
    else:
        sum = current - new
    return sum

def anticlockwise(current, new):
    sum = 0
    if new > current:
        sum = new - current
    else:
        sum = 360 - current + new
    return sum
    
 
while(1):
    line = inp.readline()
    start, first, second, third = [int(x)*9 for x in line.strip().split()]
    
    if start == 0 and first == 0 and second == 0 and third == 0:
        break
    
    degrees = 1080
    
    degrees += clockwise(start, first)
    degrees += anticlockwise(first, second)
    degrees += clockwise(second, third)
    
    print(degrees)
    
