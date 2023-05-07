package Books;

import java.util.Scanner;

public class ThrillerBook extends Book {
	  int ThrillerType;
	   String type;
	   public ThrillerBook(BookGenre genre) {
		   this.genre = genre;
	   }
	public void getBookInput(Scanner input) {
		
		System.out.println("Type the book's Title : ");
		String Title = input.next();
		this.setTitle(Title);
		
		char answer = 'x';
        while(answer !=  'y' && answer != 'Y' && answer !=  'n' && answer != 'N') 
        {
           System.out.println("Is the author of this book known? (Y/N)");
           answer = input.next().charAt(0);
           if(answer == 'y' || answer == 'Y') {
              System.out.println("Type the book's Author : ");
              String Author = input.next();
              this.setAuthor(Author);
              break;
           }
           else if (answer == 'n' || answer == 'N') {
              this.setAuthor("");
              break;
           }
           else {
        	   
           }
        }
		
		System.out.println("Type the book's Publisher : ");
		String Publisher = input.next();
		this.setPublisher(Publisher);
		
		  System.out.println("Type the Thriller's Type ");
	       System.out.println("1 : Psychological Thriller 2 : Crime Thriller 3 : Supernatural Thriller");
	       ThrillerType = input.nextInt();
	       switch (ThrillerType){
	       case 1 :
	    	   type = "Psychological Thriller";
	    	   break;
	       case 2 :
	    	   type = "Crime Thriller";
	    	   break;
	       case 3 :
	    	   type = "Supernatural Thriller";
	       default :
	       }
		
		System.out.println("Type the book's Id : ");
		int BookId = input.nextInt();
		this.setBookId(BookId);
		
		
	}
	public void printInfo() {
		   String skind = "none";
		   switch(this.genre) {
		   case Romance :
			   skind = "Romance";
			   break;
		   case Fiction :
			   skind = "Fiction";
			   break;
		   
		   case Thriller :
			   skind = "Thriller";
			   break;
			   
		   case FairyTale :
			   skind = "FairyTale";
			   break;
		   default :
			   
		   }
	       System.out.println("Book{Kind : "+ skind +"\tTitle : " + Title +"\tAuthor : "+ Author+"\tPublisher : "+ Publisher+"\tThriller's Type : " +type + "\tBookId : "+BookId+"}");
		   }	



}



