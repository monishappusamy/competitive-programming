from sys import stdin
Game = None

def solve():
    global Game
    return (Game[0] / 3) * (Game[1] / 3)
            
def main():
    global Game,leng
    inp = stdin
    length = int(inp.readline())
    for i in range(0, length):
        line = inp.readline()
        Game = [int(x) for x in line.strip().split()]
        print(solve())

main()
