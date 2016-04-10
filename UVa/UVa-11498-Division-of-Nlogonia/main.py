from sys import stdin
Game = None
divisa = None

def solve():
    global Game
    if Game[0] == divisa[0] or Game[1] == divisa[1]:
        return 'divisa'
    elif Game[0] > divisa[0] and Game[1] > divisa[1]:
        return 'NE'
    elif Game[0] < divisa[0]  and Game[1] < divisa[1]:
        return 'SO'
    elif Game[0] < divisa[0]  and Game[1] > divisa[1]:
        return 'NO'
    elif Game[0] > divisa[0]  and Game[1] < divisa[1]:
        return 'SE'
            
def main():
    global Game,leng, divisa
    inp = stdin
    length = 1
    while(1):
        length = int(inp.readline())
        if length == 0:
            break
        divisa = [int(x) for x in inp.readline().strip().split()]
        for i in range(0, length):
            line = inp.readline()
            Game = [int(x) for x in line.strip().split()]
            print(solve())

main()
