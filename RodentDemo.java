import textio.TextIO;

public class RodentDemo{
	public static void main(String[] args){
	Rodent object = new Rodent();
	Mouse a = new Mouse();
	Gerbil b = new Gerbil();
	Hamster c = new Hamster();
	GuineaPig d = new GuineaPig(); 
	
	object.eating();
	object.sleeping();
	object.grooming();
	object.moving(); 
	
	TextIO.putln();
	
	a.eating();
	a.sleeping();
	a.grooming();
	a.moving();
	a.fur();
	
	TextIO.putln();
	
	b.eating();
	b.sleeping();
	b.grooming();
	b.moving();
	b.claws();
	
	TextIO.putln();
	
	c.eating();
	c.sleeping();
	c.grooming();
	c.moving();
	c.hair();
	
	TextIO.putln();
	
	d.eating();
	d.sleeping();
	d.grooming();
	d.moving();
	d.tail();
	
	
	
	

	}
}//end of demo