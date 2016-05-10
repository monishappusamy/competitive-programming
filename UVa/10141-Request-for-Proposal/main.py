import sys

inp = sys.stdin
count = 0

while(1):
    n, p = [int(i) for i in inp.readline().split()]
    if n == 0 and p == 0:
        break
    else:
        if count != 0:
            print()
        for x in range(n):
            requirements = inp.readline()
            
        lowD = -1
        highR = -1
        
        for y in range(p):
            proposalName = inp.readline().strip()
            d, r = inp.readline().split()
            d = float(d)
            r = int(r)
            
            if lowD == -1 and highR == -1:
                lowD = d
                highR = r
                name = proposalName
            elif r > highR:
                lowD = d
                highR = r
                name = proposalName
            elif d < lowD and r == highR:
                lowD = d
                highR = r
                name = proposalName
                
            
            for x in range(r):
                h = inp.readline()
        
        count += 1
        print('RFP #{}'.format(count))
        print(name)
