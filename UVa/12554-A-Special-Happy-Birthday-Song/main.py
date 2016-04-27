import sys

inp = sys.stdin

t = int(inp.readline())
list = []

for x in range(t):
    l = inp.readline().strip()
    list.append(l)
    
song = ['Happy', 'birthday', 'to', 'you', 'Happy', 'birthday', 'to', 'you', 'Happy', 'birthday', 'to', 'Rujia', 'Happy', 'birthday', 'to', 'you' ]
temp = 0
flag = True

while(flag):
    for y in range(16):
        print('{}: {}'.format(list[temp], song[y]))
        temp = temp + 1
        if temp == len(list):
            temp = 0
            flag = False
            
    
