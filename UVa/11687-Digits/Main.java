/**
* SUBMISSION : 17382158
*/

import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException{
		Reader.init(System.in);
	    
	    while (true) {	
	    	String line = Reader.next();
			if(line.equals("END")){break;}
    		int prev = line.length();
    		int count = 1;
    		if ((prev + "").equals(line)){
    			System.out.println(count);
    		}
    		else{
	    		int curr = Integer.toString(prev).length();;
	    		count++;
	    		while (prev != curr){
	    			prev = curr;
	    			curr = Integer.toString(prev).length();
	    			count++;
	    		}
	    		System.out.println(count);
    		}
	    }
	    sc.close();
	}

}

/** Class for buffered reading int and double values */
/** http://www.cpe.ku.ac.th/~jim/java-io.html */

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}
