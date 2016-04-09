from sys import stdin
Game = None

def solve():
    global Game
    if Game[0] < Game[1]:
        return '<'
    elif Game[0] > Game[1]:
        return '>'
    elif Game[0] == Game[1]:
        return '='
            
def main():
    global Game,leng
    inp = stdin
    length = int(inp.readline())
    for i in range(0, length):
        line = inp.readline()
        Game = [int(x) for x in line.strip().split()]
        print(solve())

main()
