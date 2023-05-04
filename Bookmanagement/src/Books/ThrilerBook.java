package Books;

import java.util.Scanner;

public class ThrilerBook extends Book {
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
		
		System.out.println("Type the book's Id : ");
		int BookId = input.nextInt();
		this.setBookId(BookId);
		
	}

}
