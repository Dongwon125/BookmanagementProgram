package Bookmanagement1;
import java.util.*;

import Books.Book;
import Books.FairyTaleBook;
import Books.RomanceBook;
import Books.ThrilerBook;

public class BookManagement {
		ArrayList <Book> Books = new ArrayList<Book>();
		Scanner input;
		
		BookManagement(Scanner input){
			this.input = input;
			
		}
	
		public void addBooks() {
			int Gnum = 0;
			Book book;
			while (Gnum != 1 && Gnum != 2 && Gnum!=3 && Gnum!=4)  {
				System.out.println("1. Fiction");
				System.out.println("2. Romance");
				System.out.println("3. Thriler");
				System.out.println("4. FariyTale");
				System.out.println("select the number for Book Genre. :");
				Gnum = input.nextInt();
			
				if(Gnum == 1) {
					book = new Book();
					book.getBookInput(input);
					Books.add(book);
					break;
				}
				else if(Gnum == 2) {
					book = new RomanceBook();
					book.getBookInput(input);
					Books.add(book);
					break;
				}
				else if(Gnum == 3){
					book = new ThrilerBook();
					book.getBookInput(input);
					Books.add(book);
					break;
					
				}
				else if(Gnum ==4) {
					book = new FairyTaleBook();
					book.getBookInput(input);
					Books.add(book);
					break;
				}
				else {
					System.out.println("select the number for Book Genre. :");
				}
			}
		}
		public void deleteBooks() {
			System.out.println("Type the book's Id : ");
			 int Bookid = input.nextInt();
			int index = -1;
			 if(Books == null) {
				System.out.print("no Books Added");
			}
			for(int i=0; i<Books.size();i++) {
				if (Books.get(i).getBookId() == Bookid) {
					index = i;
					break;
				}
			}
			if (index>=0) {
			Books.remove(index);
			System.out.println("The Book " +Bookid+ "is deleted.");
			}
			else {
				System.out.print("no Books Added");
				return; 
			}
		}
		
		public void editBooks() {
			System.out.println("Type the book's Id : ");
			int BookId = input.nextInt();
			for(int n=0; n<Books.size();n++) {
				Book book = Books.get(n);
				if (book.getBookId() == BookId) {
					int num = 0;
					while (num !=5) {
						System.out.println("### Book's Info Edit Menu ###");
						System.out.println("1. Edit Title");
						System.out.println("2. Edit Author");
						System.out.println("3. Edit Publisher");
						System.out.println("4. Edit Book's Id");
						System.out.println("5. Exit");
						num = input.nextInt();
						if (num ==1) {
							System.out.print("Type Title : ");
							String Title = input.next();
							book.setTitle(Title);
						}
						else if (num ==2) {
							System.out.print("Type Author : ");
							String Author = input.next(); 
							book.setAuthor(Author);
						}
						else if (num ==3) {
							System.out.print("Type Publisher : ");
							String Publisher = input.next();
							book.setPublisher(Publisher);
						}
						else if (num ==4) {
							System.out.print("Type Book's Id : ");
							int BookId1 = input.nextInt();
							book.setBookId(BookId1);
						}
						else {
							break;
						}
					}
					
				}
				
			}
		}
		public void viewBooks() {     
		for(Book book : Books ) {
			book.printInfo();
		}
		
	}
}


