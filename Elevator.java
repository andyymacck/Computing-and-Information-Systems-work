import textio.TextIO;
import java.lang.Object;	//This import is so we can use the finalize() method

public class Elevator{
	private final int floor; 	//How many floors we can find in the building
	private int current;		//This will indicate the floor 
	
	public Elevator(){		//default constructor
		floor = 5;
		current = 1;
	}	
	public Elevator(int f){		//parameter constructor
		floor = f;
		current = 1;
		TextIO.putln("Elevator object with " + f + " floors created.\n");
	}
	public int getCurrent(){
		return current;
	}	
	public void setCurrent(int c){
		current = c;
	}	
	
	public void up(int f){
		if(f > floor){
			TextIO.putln("You have input " + f + " which is a level higher than the total of floors. Total floors is: " + floor);
		}	
		else if(f<current){
			TextIO.putln("Elevator cannot go up to floor " + f + " when you are on " + current + ".");
		}	
		else if(f < 1){
			TextIO.putln("Elevator cannot go below 1 we do not have a basement.");
		}	
		else if(f == current){
			TextIO.putln("Elevator is already on floor " + f);
		}	
		else{
			for(int i = current; i < f; i++){
				TextIO.putln("Elevator going up, it is on floor " + current++ + ".");
			}
			setCurrent(f);
			TextIO.putln("Elevator currently at floor " + getCurrent() + ". Please step in.");
		}	
	}	
	
	public void down(int f){
		if(f > floor){
			TextIO.putln("You have input " + f + " which is a level higher than the total of floors. Total floors is: " + floor);
		}	
		else if(f>current){
			TextIO.putln("Elevator cannot go up to floor " + f + " when you are on " + getCurrent() + ".");
		}	
		else if(f < 1){
			TextIO.putln("Elevator cannot go below 1 we do not have a basement.");
		}	
		else if(f == current){
			TextIO.putln("Elevator is already on floor " + f);
		}	
		else{
			for(int i = getCurrent(); i > f; i--){
				TextIO.putln("Elevator going down, it is on floor " + i + ".");
			}
			setCurrent(f);
			TextIO.putln("Elevator currently at floor " + current + ". Please step in.");
		}	
	}	

	@Override
	protected void finalize() throws Throwable{
		current = 1;
		TextIO.putln("Elevator is returning to bottom level.");
	}	
	
	public static void main(String[] args){
		Elevator tower = new Elevator(15);
		
		TextIO.putln("Test up() method with 10 as input. Going from 1 to 10.");		//checking down() when current < input	
		tower.up(10);
		
		TextIO.putln("\nTest down() method with 5 as input. Going from 10 to 5.");	//checking down() when current > input		
		tower.down(5);
		
		TextIO.putln("\nTest up() method with 5 as input. Going from 5 to 5.");		//checking up() when equal to current	
		tower.up(5);
		
		TextIO.putln("\nTest down() method with 5 as input. Going from 5 to 5.");	//checking down() when equal to current	
		tower.down(5);
		
		TextIO.putln("\nTest up() method with 30 as input. Going from 5 to 30.");	//Making sure input over total floors won't work			
		tower.up(30);
		
		TextIO.putln("\nTest down() when -1 is input.");		
		tower.down(-1);																//No basement in this question scope
		
		tower = null; 																//variable set to null										
		tower = new Elevator(); 													//variable set to a new object using default constructor
		
		TextIO.putln("\nThe Elevator was set to null and now should be reset. Current floor is: " + tower.getCurrent());
		
	}// end of main
}//end of Elevator class