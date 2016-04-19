import sys

testcase = int(raw_input())

for i in range(0, testcase):
    symbol = '*'
    flag = True
    row, column = map(int,raw_input().split())
    for i in range(0, row):
        print
        for j in range(0, column):
            if i == 0 or i == row-1:
                sys.stdout.write('*')
                continue
            if j == 0 or j == column-1:
            	sys.stdout.write('*')
            else:
            	sys.stdout.write('.')
    print
