package Bookmanagement1;

import java.util.*;

public class Week1 {


public static void main(String[] args) {
	


	
		int num = 0;
		Scanner input = new Scanner(System.in);
				
		while (num !=6) {
			System.out.println("1. Add books");
			System.out.println("2. Delete books");
			System.out.println("3. Edit books");
			System.out.println("4. view books");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("select one number between 1 to 6: ");
			num = input.nextInt();
					
			if (num==1){					
				System.out.println("Type your student Id : ");
				int studentId = input.nextInt();
				System.out.println("Type the book's Title : ");
				String Title = input.next();
				System.out.println("Type the book's Id : ");
				int Author = input.nextInt();
				System.out.println("Type the Day of the Week today (mon to sun) : ");
				String Day = input.next();
				}
			}
				
		}
}
 

