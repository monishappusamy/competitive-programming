import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int height = in.nextInt();
		int whitespaces=0, hash=0;
		
		whitespaces = height;
		hash=0;
		
		for(int i=0; i<height; i++){
			--whitespaces;
			++hash;
			for(int j=0; j<whitespaces;j++)
				System.out.print(" ");
			for(int k=0; k<hash; k++)
				System.out.print("#");
			System.out.println();
		}
		in.close();
			
	}

}
