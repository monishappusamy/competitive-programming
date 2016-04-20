import sys

testcase = int(raw_input())

for i in range(0, testcase):
    symbol = '*'
    flag = True
    row, column, height, width = map(int,raw_input().split())
    row = (row * (height+1)) + 1
    column = (column * (width+1)) + 1
    
    for i in range(0, row):
        print
        for j in range(0, column):
            if i % (height+1) == 0:
                sys.stdout.write('*')
                continue
            if j % (width+1) == 0:
            	sys.stdout.write('*')
            else:
            	sys.stdout.write('.')
    print
