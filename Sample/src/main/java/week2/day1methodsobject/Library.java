package week2.day1methodsobject;

public class Library {

		
		public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		}
		
		public void issueBook() {
		System.out.println("Book issued Successfully");
   
		}
		
		public static void main(String[]args) {
			Library library1=new Library();
			String booksLib =library1.addBook(" Books in the Library");
			System.out.println("Return bookTitle"+ booksLib);
			library1.issueBook();
			
		}
}
	