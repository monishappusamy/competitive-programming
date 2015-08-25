import java.util.Scanner;

public class TimeConversion {
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		inp.useDelimiter("\\n");
		
		String input = inp.next();		
		
		char time = input.charAt(8);
		
		int hours = Integer.parseInt(input.substring(0, 2));
		
		if (time == 'P'){
			if(hours == 12){
				System.out.println(hours + input.substring(2, 8));
			}
			else{
				hours += 12;
				System.out.println(hours + input.substring(2, 8));
			}
		}
		else{
			if(hours == 12){
				System.out.println("00" + input.substring(2, 8));
			}
			else
				System.out.println(input.substring(0, 8));
		}
		inp.close();
	}
}
