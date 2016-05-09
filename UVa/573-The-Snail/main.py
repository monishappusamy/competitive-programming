import sys

inp = sys.stdin

while(1):
    line = [int(i) for i in inp.readline().split()]
    if line[0] == 0 and line[1] == 0 and line[2] == 0 and line[3] == 0:
        break
    else:
        day = 0
        initialHeight = 0
        distanceClimbed = 0
        afterClimbing = 0
        afterSliding = 0
        fatigue = (line[3] / 100) * line[1]
        distanceClimbed = line[1]
        
        while(1):
            day += 1

            afterClimbing = initialHeight + distanceClimbed
            afterSliding = afterClimbing - line[2]
            distanceClimbed -= fatigue

            if distanceClimbed < 0:
                distanceClimbed = 0
            
            initialHeight = afterSliding
            
            if afterClimbing > line[0]:
                print('success on day {}'.format(day))
                break
            if afterSliding < 0:
                print('failure on day {}'.format(day))
                break
