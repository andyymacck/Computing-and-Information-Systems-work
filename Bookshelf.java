import textio.TextIO;
import java.util.*; //This is so we can use ArrayList

public class Calllist{
	public static void main(String[] args){
		ArrayList<employee> list = new ArrayList<employee>();
		employee Andrew = new employee ("Andrew", 1980 );		
		employee Jenn = new employee ("Jenn", 1980);			
		employee Steve = new employee ("Steve", 1985);			
		employee Quinn = new employee ("Quinn", 1986);		
		employee Rachel = new employee ("Rachel", 1990);	
		employee Marty = new employee ("Marty", 1992);			
		employee Warwick = new employee ("Warwick", 1992);		
		employee Craig = new employee ("Craig", 1993);		
		employee Shauna = new employee ("Shauna", 1994);	
		employee Rick = new employee ("Rick", 1995);	
		employee Anthony = new employee ("Anthony", 1995);	
		employee Sarah = new employee ("Sarah", 1996);		
		
		list.add(Andrew);
		list.add(Jenn);	
		list.add(Steve);
		list.add(Quinn);
		list.add(Rachel);
		list.add(Marty);
		list.add(Warwick);
		list.add(Craig);
		list.add(Shauna);
		list.add(Rick );
		list.add(Anthony);		
		list.add(Sarah);
		
		TextIO.putln("This is the output before any sorting.");
		for(int i = 0; i < list.size(); i++){
			TextIO.put(list.get(i).getTitle());	//Get the element from the list (bookshelf) and then get the title
			TextIO.put("\t" + list.get(i).getYearPublication() + "\n" );//get the year published
		}	
		
		TextIO.putln("\nThis is the output after it is sorted by title ascending alphabetically.");
		list.sort(Comparator.comparing(Book::getTitle) );	//This will sort list by the title
		for(int i = 0; i < list.size(); i++){
			TextIO.put(list.get(i).getTitle() );	//Get the element from the list (bookshelf) and then get the title
			TextIO.put("\t" + list.get(i).getYearPublication() + "\n" );//get the year published
		}
		
		TextIO.putln("\nThis is the output after it is sorted by year published ascending numerically.");
		list.sort(Comparator.comparing(Book::getYearPublication) );	//This will sort list by the title
		for(int i = 0; i < list.size(); i++){
			TextIO.put(list.get(i).getTitle() );	//Get the element from the list (bookshelf) and then get the title
			TextIO.put("\t" + list.get(i).getYearPublication() + "\n" );//get the year published
		}		
		
	}

}//end of Bookshelf class