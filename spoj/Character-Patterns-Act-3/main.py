import sys

testcase = int(raw_input())

for i in range(0, testcase):
    symbol = '*'
    flag = True
    row, column = map(int,raw_input().split())
    row = (row * 3) + 1
    column = (column * 3) + 1
    
    for i in range(0, row):
        print
        for j in range(0, column):
            if i % 3 == 0:
                sys.stdout.write('*')
                continue
            if j % 3 == 0:
            	sys.stdout.write('*')
            else:
            	sys.stdout.write('.')
    print
