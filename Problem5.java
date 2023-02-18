 
/**
 * title: Problem5 
 * description: Generates and displays all prime numbers under 10,000
 * date: April 20th, 2021
 * @author Andrew Mackay
 * @version 1.0
 * @copyright Andrew Mackay
*/
 
 
 
 import textio.TextIO;
	
public class Problem5{
	
	public static void main(String[] args){ 
	int counter = 0;
	TextIO.putln (" All prime numbers below 10,000: ");//display message 
		
		
		for(int i = 2; i<=10000; i ++ ){ //the for loop that controls the start and end of parameters
			for(int j = 1; j<=i; j ++ ){ //nested loop for factoring
				if(i%j==0){ //remainder 
					counter ++; 	
			}
			}
			if(counter == 2){
			TextIO.putln (i);		
			}
			
			
			counter = 0;
		}
	}	
}