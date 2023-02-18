
/**
 * title: problem1
 * description: Generates and displays a multiplication table from 1-12
 * date: April 15th, 2021
 * @author Andrew Mackay
 * @version 1.0
 * @copyright Andrew Mackay
*/
 


import textio.TextIO;

public class problem1{
	static public void main(String [] args){
		for(int i = 0; i <=12; i++){
			TextIO.put("\t|   ");
			if(i == 0){TextIO.put(" ");} //Do not output "0" but instead " "
			else{TextIO.put(i);}//Output numbers above 0			
			
		}
		TextIO.putln("\t|");//Start at first line of multiplication
		
		for(int i = 1; i <= 12; i++){ //Vertical Lines
			TextIO.put("\t|   " + i);
			for(int j = 1; j <= 12; j++){//Horizontal Lines
				TextIO.put("\t|   " + (i*j) ); //Output multiplication of row and column
			}	
			TextIO.putln("\t|");//Ending vertical line for formatting
		}
	
	
	}//End of main
}//End of program