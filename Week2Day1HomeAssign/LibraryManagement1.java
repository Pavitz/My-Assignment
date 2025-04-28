package Week2Day1HomeAssign;

public class LibraryManagement1 {

			  public static void main (String[] args) {
		        Library Lib1 = new Library(); 
		       
		        String title = Lib1.addBook("Think like a Monk"); //  addbook method
		        System.out.println("Added Book Title: " + title);
		        
		        Lib1.issueBook(); // issue method
		    }
		
		   	
	}
	

	