package Bookmanagement1;
import java.util.*;
public class MenuManagement {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManagement BookManagement = new BookManagement(input);
		int num = 0;
		int PW = 1234;
		System.out.println("Type the admin PW : ");
		int Pw= input.nextInt();
		if (Pw!=PW) {
			System.out.println("Wrong Access.");
			return;
			
		}
		
		
		while (num !=6) {
			System.out.println("### Book Management System Menu ###");
			System.out.println("1. Add books");
			System.out.println("2. Delete books");
			System.out.println("3. Edit books");
			System.out.println("4. View books");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("select one number between 1 to 6: ");
			num = input.nextInt();
					
			if (num==1){					
				BookManagement.addBooks();	
			}
			else if(num==2) {
				BookManagement.deleteBooks();
			}
			else if(num==3) {
				BookManagement.editBooks();
			}
			else if(num==4) {
				BookManagement.viewBooks();
			}
			else {
				continue;
			}
		}
	}
		
		

}

 

