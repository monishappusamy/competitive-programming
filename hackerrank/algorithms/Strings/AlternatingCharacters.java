import java.util.Scanner;

public class AlternatingCharacters {
    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i=0; i<T; i++){
			String input = in.next();
			char a[] = input.toCharArray();
			Boolean flag = true;
			char opposite;
			int delete = 0;
			char current = a[0];
			if (a[0] == 'A')
				opposite = 'B';
			else
				opposite = 'A';
			for(int j=1; j<a.length; j++){
				if (flag == true){
					if(a[j] == opposite)
						flag = false;
					else
						delete = delete + 1;
				}
				else{
					if(a[j] == current)
						flag = true;
					else
						delete = delete + 1;
				}
			}
			System.out.println(delete);
		}
		in.close();
	}
}
