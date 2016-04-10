from sys import stdin
Game = None

def solve():
    global Game
    Game = Game[1:]
    Game = sorted(Game)
    return Game[len(Game)-1] 
            
def main():
    global Game,leng
    inp = stdin
    length = int(inp.readline())
    for i in range(0, length):
        line = inp.readline()
        Game = [int(x) for x in line.strip().split()]
        print ('Case ' + str(i+1) + ': ' + str(solve()))

main()
