import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_width;
        array_width = in.nextInt();
        int total_cases;
        total_cases = in.nextInt();
        int segment_width[] = new int[array_width];
        
        for(int i=0; i<array_width;i++){
        	segment_width[i] = in.nextInt();
        }
        
        for(int j=0; j<total_cases;j++){
        	int enter_lane_no = in.nextInt();
        	int exit_lane_no = in.nextInt();
        	int least = segment_width[enter_lane_no];
        	
        	for(int k=enter_lane_no+1; k<=exit_lane_no; k++){
        		if( segment_width[k] < least ){
        			least = segment_width[k];
        		}
        		else{
        			continue;
        		}
        	}
        	System.out.println(least);
        }
        in.close();
    }
}