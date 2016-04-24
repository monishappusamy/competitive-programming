import sys

inp = sys.stdin

while(1):
    my_dict = {}
    s = [float(i) for i in inp.readline().split()]
    duration = s[0]
    down = s[1]
    owe = s[2]
    n = int(s[3])
    
    monthly = owe / duration
    worth = owe + down
    
    if s[0] < 0:
        break

    for i in range(0, n):
        s = inp.readline().strip().split()
        my_dict[int(s[0])] = float(s[1])
    
    t = 0
    
    while(1):
        if t > 0:
            owe = owe - monthly
        if t in my_dict:
            percentage = my_dict[t]
        worth = worth - (worth * percentage)
        if owe < worth:
            if t == 1:
                print ('1 month')
            else:
                print (t, 'months')
            break
        t += 1
