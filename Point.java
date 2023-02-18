import textio.TextIO;
import java.lang.Math;		//This is for pow and sqrt
import java.text.DecimalFormat; //This is to set precision of circumference

public class Point{
	//member variables
	private double x = 0.0;
	private double y = 0.0;
	
	public Point(){
		
	}	
	public Point(double a, double b){
		x = a;
		y = b;
	}
	public void print(){
		TextIO.put("(" + x + ", " + y + ")");
	}	
	public Point add(Point p){
		double a = (getX() + p.getX() );
		double b = (getY() + p.getY() );
		Point temp = new Point();
		temp.setX(a);
		temp.setY(b);
		return temp;
	}
	public double getX(){
		return x;
	}	
	public double getY(){
		return y;
	}
	public void setX(double a){
		x = a;
	}	
	public void setY(double b){
		y = b;
	}
	
}//End of point class

class Shape{
	public void area(){
		TextIO.putln("Area default String.");
	}	
	public void print(){
		TextIO.putln("Circumference default String.");
	}	
}//End of Shape class


class Circle extends Shape{
	//member variables
	private Point A;
	private double radius = 0.0;
	
	Circle(){
		
	}
	Circle(Point a, double r){
		A = a;
		radius = r;
	}	
	public void print(){
		TextIO.putln("This object is a Circle.");
		
		TextIO.put("Point located at: ");
		A.print();
		TextIO.putln();
		
		TextIO.put("Circumference: ");
		area();
		TextIO.putln();		
	}	
	public void area(){
		DecimalFormat df = new DecimalFormat("#.###");
		double a = 3.1415*(radius*radius);
		TextIO.put(df.format(a) );
	}	
}//End of Circle class

class Rectangle extends Shape{
	//member variables
	private Point A;
	private Point B;
	private Point C;
	private Point D;
	
	Rectangle(){
			
	}
	Rectangle(Point a, Point b, Point c, Point d){
		A = a;
		B = b;
		C = c;
		D = d;
	}	
	public void print(){
		TextIO.putln("This object is a Rectangle.");
		
		TextIO.put("Point A located at: ");
		A.print();
		TextIO.putln(); //To go to the next line for formatting purposes.
		
		TextIO.put("Point B located at: ");
		B.print();
		TextIO.putln(); //To go to the next line for formatting purposes.
		
		TextIO.put("Point C located at: ");
		C.print();
		TextIO.putln(); //To go to the next line for formatting purposes.
		
		TextIO.put("Point D located at: ");
		D.print();
		TextIO.putln(); //To go to the next line for formatting purposes.

		area();	//Call the rectangles area method
	}	
	public void area(){
		double height = 0.0;
		double length = 0.0;
		double sum = 0.0;
		
		height = B.getY() - A.getY();
		if(height < 0){height *= -1;}	//convert height to positive double
		
		length = A.getX() - D.getX();
		if(length < 0){length *= -1;}	//convert length to positive double
		
		sum = height * length;
		
		TextIO.putln("The area of the Rectangle is: " + sum);
		
		if(height == length){
			TextIO.putln("This is a square! :)");
		}	
	}	
}//End of Rectangle class

class Triangle extends Shape{
	//member variables
	private Point A;
	private Point B;
	private Point C;

	Triangle(){
		
	}
	Triangle(Point a, Point b, Point c){
		A = a;
		B = b;
		C = c;
	}	
	public void print(){
		TextIO.putln("This object is a Triangle.");
		
		TextIO.put("Point A located at: ");
		A.print();
		TextIO.putln(); //To go to the next line for formatting purposes.
		
		TextIO.put("Point B located at: ");
		B.print();
		TextIO.putln(); //To go to the next line for formatting purposes.
		
		TextIO.put("Point C located at: ");
		C.print();
		TextIO.putln(); //To go to the next line for formatting purposes.
		area();
	}		
	public void area(){
		double sum = 0.0;
		double length = 0.0;
		double height = 0.0;
		
		length = A.getX() - C.getX();
		height = A.getY() - B.getY();
		
		sum = length * height;
		sum /= 2;
		
		TextIO.putln("The area of the Triangle is: " + sum);
	}		
	

}//End of Triangle class	