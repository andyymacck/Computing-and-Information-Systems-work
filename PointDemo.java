import textio.TextIO;

public class PointDemo{
	public static void main(String [] args){
		Point testA = new Point(1.0,1.0);
		Point testB = new Point (1.0, 5.0);
		Point testC = new Point (5.0, 5.0);
		Point testD = new Point(5.0,1.0);
		Point testE = new Point (5.0,6.0);
		Point testF = new Point (6.0, 1.0);
		
		Circle A = new Circle(testA, 5);
		Rectangle B = new Rectangle(testA, testB, testE, testF);
		Triangle C = new Triangle(testA, testB, testD);
		Rectangle D = new Rectangle(testA, testB, testC, testD);
		
		A.print();			//output circle
		TextIO.putln();
		
		B.print();			//output rectangle (non-square)
		TextIO.putln();
		
		C.print();			//output triangle 
		TextIO.putln();
		
		D.print();			//output rectangle (square)
		TextIO.putln();		
	}
}//end of PointDemo class