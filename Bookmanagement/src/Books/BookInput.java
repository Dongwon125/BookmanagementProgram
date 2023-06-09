package Books;

import java.util.Scanner;

import exception.PubFormatException;

public interface BookInput {
	public int getBookId();
	
	public String getTitle();
	
	public String getAuthor();
	
	public String getPublisher();
	
	public String getKindString();
	
	public String getKindDetail();
	 
	public void getUserInput(Scanner input); 

	public void setTitle(String title);

	public void setAuthor(String author);

	public void setPublisher(String publisher) throws PubFormatException;

	public void setId(int bookId);

	public void printInfo();
	
	 public void setBookTitle(Scanner input);
	 public void setBookAuthor(Scanner input);
	 public void setBookPublisher(Scanner input);
	 public void setBookId(Scanner input);
	 public void checkAuthorKnown(Scanner input);  
}


