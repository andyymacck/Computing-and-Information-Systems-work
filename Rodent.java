import textio.TextIO;

public class Rodent{ 
	/**
	*	Create a new instance of class Rodent. Initialize instance
	* 	as a default constructor 
	*/
	public Rodent(){	
		
	}
	public void eating(){
		TextIO.putln("Rodent is eating");		
	}
	public void sleeping(){
		TextIO.putln("Rodent is sleeping");
	}
	public void grooming(){
		TextIO.putln("Rodent is grooming");
	}
	public void moving(){
		TextIO.putln("Rodent is moving");
	}
	
}
//end of class Rodent

class Mouse extends Rodent{
	
 

	/**
	*	Create a new instance of class Rodent. Initialize instance
	* 	as a default constructor 
	*/
	public Mouse(){	
		
	}
	public void eating(){
		TextIO.putln("Mouse is eating");		
	}
	public void sleeping(){
		TextIO.putln("Mouse is sleeping");
	}
	public void grooming(){
		TextIO.putln("Mouse is grooming");
	}
	public void moving(){
		TextIO.putln("Mouse is moving");
	}
	public void fur(){
		TextIO.putln("Mouse has fur");
	}
}//end of class mouse

class Gerbil extends Rodent{
	
 

	/**
	*	Create a new instance of class Rodent. Initialize instance
	* 	as a default constructor 
	*/
	public Gerbil(){	
		
	}

	public void eating(){
		TextIO.putln("Gerbil is eating");		
	}
	public void sleeping(){
		TextIO.putln("Gerbil is sleeping");
	}
	public void grooming(){
		TextIO.putln("Gerbil is grooming");
	}
	public void moving(){
		TextIO.putln("Gerbil is moving");
	}
	public void claws(){
		TextIO.putln("Gerbil has claws");
	}
}//end of class Gerbil

class Hamster extends Rodent{
	
 

	/**
	*	Create a new instance of class Rodent. Initialize instance
	* 	as a default constructor 
	*/
	public Hamster(){	
		
	}
	public void eating(){
		TextIO.putln("Hamster is eating");		
	}
	public void sleeping(){
		TextIO.putln("Hamster is sleeping");
	}
	public void grooming(){
		TextIO.putln("Hamster is grooming");
	}
	public void moving(){
		TextIO.putln("Hamster is moving");
	}
	public void hair(){
		TextIO.putln("Hamster has hair");
	}
}//end of class Hamster
class GuineaPig extends Rodent{
	
	/**
	*	Create a new instance of class Rodent. Initialize instance
	* 	as a default constructor 
	*/
	public GuineaPig(){	
		
	}

	public void eating(){
		TextIO.putln("guinea pig is eating");		
	}
	public void sleeping(){
		TextIO.putln("guinea pig is sleeping");
	}
	public void grooming(){
		TextIO.putln("guinea pig is grooming");
	}
	public void moving(){
		TextIO.putln("guinea pig is moving");
	}
	public void tail(){
		TextIO.putln("Guinea pig has a tail");
	}
}//end of class guinea pig