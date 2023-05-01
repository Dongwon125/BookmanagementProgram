package Books;

import java.util.Scanner;

public class Book {
	protected BookGenre genre = BookGenre.Fiction;
	protected String Title;
	protected String Author;
	protected String Publisher;
	protected int BookId;

	public Book() {
		
	}

	public Book(String Title, String Author, String Publisher, int BookId) {
		this.Title = Title;
		this.Author = Author;
		this.Publisher = Publisher;
		this.BookId = BookId;
		
	}
	public String getTitle() {
		return Title;
	}
	public String getAuthor() {
		return Author;
	}
	public String getPublisher(){
		return Publisher;
	}
	public int getBookId() {
		return BookId;
	}
	public BookGenre getGenre() {
		return genre;
	}

	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public void printInfo() {
		System.out.println("Book{Title : " + Title +" Author : "+ Author+" Publisher : "+ Publisher+" BookId : "+BookId+"}");
	}
	public void getBookInput(Scanner input) {
		
		System.out.println("Type the book's Title : ");
		String Title = input.next();
		this.setTitle(Title);
		
		System.out.println("Type the book's Author : ");
		String Author = input.next();
		this.setAuthor(Author);
		
		System.out.println("Type the book's Publisher : ");
		String Publisher = input.next();
		this.setPublisher(Publisher);
		
		System.out.println("Type the book's Id : ");
		int BookId = input.nextInt();
		this.setBookId(BookId);
		
	}
}

