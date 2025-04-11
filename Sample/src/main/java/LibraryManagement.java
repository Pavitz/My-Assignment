import week2.day1methodsobject.Library;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib2= new Library();
		String booksLib = 	lib2.addBook(" In the Library" );
		System.out.println(" Return Book Title" + booksLib);
		lib2.issueBook();
		
		

	}

}
