import textio.TextIO;

public class animal{
	void sound(){	
		TextIO.putln ("An animal makes a sound based on the animal that it is.");  //default animal noise
	}
	animal(){
		TextIO.putln ("I am an animal");  //create a new instance of class animal
	}		
}	

class pig extends animal{
	void sound(){	
		TextIO.putln ("oink");  //pig noise
	}
	pig(){
		TextIO.putln ("I am a pig");  //create a new instance of pig class
	}			
}	

class sheep extends animal{
	void sound(){	
		TextIO.putln ("baah");  //sheep noise
	}
	sheep(){
		TextIO.putln ("I am a sheep");  //create a new instance of sheep class
	}			
}	

class duck extends animal{
	void sound(){	
		TextIO.putln ("quack");  //pig noise
	}
	duck(){
		TextIO.putln ("I am a duck");  //create a new instance of duck class
	}			
}	

class cow extends animal{
	void sound(){	
		TextIO.putln ("moo");  //pig noise
	}
	cow(){
		TextIO.putln ("I am a cow");  //create a new instance of cow class
	}			
}	

