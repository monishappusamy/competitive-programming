import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int array_size;
        array_size = in.nextInt();

        
        long array_elements[] = new long[array_size];
        long sum=0;
        
        for(int i=0; i<array_size;i++){
        	array_elements[i] = in.nextInt();
        }
        
        for(int j=0; j<array_size;j++){
        	sum += array_elements[j];
        	}
        System.out.println(sum);
        in.close();
	}
}