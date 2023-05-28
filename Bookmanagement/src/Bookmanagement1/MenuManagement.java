package Bookmanagement1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManagement {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		BookManagement bookManagement = getObject("bookmanagement.ser");
		if(bookManagement == null) {
			bookManagement = new BookManagement(input);
		}
			
		int PW = 1234;
		System.out.println("Type the admin PW : ");
		int Pw = input.nextInt();
		logger.log("Accessing PW");
		if (Pw != PW) {
			System.out.println("Wrong Access."); // 패스워드가 일치하지 않으면 "Wrong Access." 출력하고 종료
			return;
		}
		selectMenu(input, bookManagement);
		putObject(bookManagement,"bookmanagement.ser");
	}
	public static void selectMenu(Scanner input, BookManagement bookManagement ) {
		int num = -1;
		while (num != 5) { // num이 5가 아닐 때까지 반복
			try{
			    showMenu();
				
				num = input.nextInt(); // 사용자로부터 번호 입력받기
				switch(num) {
				case 1:
					bookManagement.addBooks();
					logger.log("Add Books");
					break;
				case 2:
					bookManagement.deleteBooks(); // 책 삭제 메소드 실행
					logger.log("Delete Books");
					break;
				case 3:
					bookManagement.editBooks(); // 책 수정 메소드 실행
					logger.log("Edit Books");
					break;
				case 4:
					bookManagement.viewBooks(); // 책 조회 메소드 실행
					logger.log("View Books");
					break;
				default:
					continue;
			}
		}
			catch(InputMismatchException e){
				System.out.println("1~5사이의 값을 입력해주세요!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}// while문 종료 (5를 선택한 경우)
	public static void showMenu() {
		System.out.println("### Book Management System Menu ###");
		System.out.println("1. Add books"); // 책 추가하기
		System.out.println("2. Delete books"); // 책 삭제하기
		System.out.println("3. Edit books"); // 책 수정하기
		System.out.println("4. View books"); // 책 조회하기
		System.out.println("5. Exit"); // 종료하기
		System.out.print("select one number between 1 to 5: ");
	}
	
	
	public static BookManagement getObject(String filename) {
		BookManagement bookManagement = null;
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			bookManagement = (BookManagement)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return bookManagement;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookManagement;
	}
	public static void putObject(BookManagement bookManagement,String filename) {
	 
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(bookManagement);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


