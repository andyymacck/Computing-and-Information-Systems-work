import java.io.*;
import textio.TextIO;

public class Problem2 {
	public static void main(String[] args){
		String sentence = " ";
		
		TextIO.putln("Input file");
		sentence = TextIO.getln();
		File temp = new File(sentence);
		
		if(temp.exists() ){
			TextIO.putln("File successfully found");
			TextIO.readFile(sentence);
			
			while(TextIO.eof()==false){
				sentence = TextIO.getln();
				TextIO.putln(sentence); 
			}
		}
		else{
		TextIO.putln("File not found");	
			
		}
	}
}	