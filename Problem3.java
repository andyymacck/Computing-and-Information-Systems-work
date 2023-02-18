import textio.TextIO;

public class TextFileReader{
	private String[] lines = new String[100];
	
	TextFileReader(){
		
	}
	TextFileReader(String F){
		int i = 0;
		String s = " ";
		
		if(temp.exists() ){
			TextIO.putln("File successfully found");
			TextIO.readFile(F);
			
			while(TextIO.eof()==false){
				s = TextIO.getln();
				lines[i]=s;
			}
		}
		else{
		TextIO.putln("File not found");	
			
		}	
	}
	
	
} //end of problem3 class
