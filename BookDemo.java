import textio.TextIO;
/*

*Expected ouput:
*
*Title:                  The Giver
*
*Title:                  The fellowship of the ring
*ISBNnumber:             145-678-990
*
*Title:                  Beach guy
*Author:                 Roald Dahl
*Edition:                7
*ISBNnumber:             145-679-004
*Publisher:              Penguin publishers
*Year of Publication:    1978
*
*
*
*Title:                  Beach guy
*Author:                 Roald Dahl
*Edition:                7
*ISBNnumber:             145-679-004
*Publisher:              Penguin publishers
*Year of Publication:    1978
*/
public class BookDemo{
	public static void main (String[] args){
		Book TheGiver = new Book("The Giver");  
		Book Fellowship = new Book("The fellowship of the ring","145-678-990");
		Book Beachguy = new Book("Beach guy", "145-679-004", "Roald Dahl", 7, "Penguin publishers", 1978);
		Book Test = new Book();
		
		TheGiver.print();
		Fellowship.print();
		Beachguy.print();
		Test.print();
		
		Test.setTitle(Beachguy.getTitle() );
		Test.setISBNnumber(Beachguy.getISBNnumber() );
		Test.setAuthor(Beachguy.getAuthor() );
		Test.setEdition(Beachguy.getEdition() );
		Test.setPublisher(Beachguy.getPublisher() );
		Test.setYearPublication(Beachguy.getYearPublication() );
		
		Test.print();
	}
}