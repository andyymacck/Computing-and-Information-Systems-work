import java.io.*;
import textio.TextIO;

public class TextFileReader{
	private String[] lines = new String[100];
	
	public static void main(String args[]) {
	
	TextFileReader(){
		
	}
	TextFileReader(String F){
		int i = 0;
		String s = " ";
		
		File temp = new File(F);
		if(temp.exists() ){
			TextIO.putln("File successfully found");
			TextIO.readFile(F);
			
			while(TextIO.eof()==false){
				s = TextIO.getln();
				lines[i]=s;
				i++;
			}
		}
		else{
		TextIO.putln("File not found");	
			
		}	
	}
	
	public String contents(){
			String s = " ";
			int i = 0;
			while(i<100){
				s += lines[i];
			}
			
			return s;
	}
	public void display(){
		
	}
	
	
} //end of problem3 class
}