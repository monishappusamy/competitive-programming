import sys

testcase = int(raw_input())

for i in range(0, testcase):
    column_flag = False
    row_flag = False
    row, column = map(int,raw_input().split())
    for i in range(0, row):
        print
        if row_flag == False:
            row_flag = True
            column_flag = False
        else:
            row_flag = False
            column_flag = True
        for j in range(0, column):
            if column_flag == False:
                column_flag = True
                sys.stdout.write('*')
            else:
                column_flag = False
                sys.stdout.write('.')
    print
