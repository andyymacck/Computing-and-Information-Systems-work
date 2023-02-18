import textio.TextIO;

public class Problem4{
	public static void main(String[] args){
		float[] array1 = new float[25];
		float[] array2 = new float[25];
		float[] array3 = new float[25];
		
		for(int i = 0; i < 25; i++){	//First for fills array with loop counter (i).
			array1[i] = i;
		}	
		for(int i = 0; i < 25; i++){	//Second for fills array with loop counter square (i^2).
			array2[i] = (i*i);
		}			
		for(int i = 0; i < 25; i++){	//Third fills array with array1[i] + array2[i].
			array3[i] = array1[i] + array2[i];
		}	
		
		for(int i = 0; i < 25; i++){
			TextIO.putln(array1[i] + " + " + array2[i] + " = " + array3[i]);
		}			
	}	
}//end of Problem4class

