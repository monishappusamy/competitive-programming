testcase = int(raw_input())

for i in range(0, testcase):
    inp = raw_input()
    inp = inp[0:(len(inp)/2)]
    print inp[::2]
