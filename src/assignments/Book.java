package assignments;

public class Book {
	String title;
	String Author;
	int pageCount;
	int totalbooks;

	public static void main(String[] args) {
		//q1: Define a class named Book with the following attributes:
		int totalbooks=0;
		
		//q2: Create three Book objects and initialize their properties with different values.
		
		Book b1 = new Book();
		b1.title ="HarryPotter";
		b1.Author="J.K. Rowling";
		b1.pageCount =450;
		totalbooks++;
		// q3: Print the details of each book and the total number of books.
		System.out.println("Title: "+" "+b1.title +" by "+b1.Author);
		System.out.println("Page Count of the book:"+b1.pageCount);
		System.out.println("Total number of books:"+ totalbooks);
		
		Book b2 = new Book();
		b2.title ="The Adventures of Tom Sawyer";
		b2.Author="Mark Twain";
		b2.pageCount =680;
		totalbooks++;
		
		// q3: Print the details of each book and the total number of books.
				System.out.println("Title: "+" "+b2.title +" by "+b2.Author);
				System.out.println("Page Count of the book:"+b2.pageCount);
				System.out.println("Total number of books:"+ totalbooks);
		
		Book b3 = new Book();
		b3.title ="Dracula";
		b3.Author="Bram Stoker";
		b3.pageCount =990;
		totalbooks++;
		
		// q3: Print the details of each book and the total number of books.
		System.out.println("Title: "+" "+b3.title +" by "+b3.Author);
		System.out.println("Page Count of the book:"+b3.pageCount);
		System.out.println("Total number of books:"+ totalbooks);
		
		// q4: Modify the pageCount attribute of one book and print the updated details.
		b2.pageCount= 1070;
		System.out.println("After Modification of page count of book2");
		b2.title ="The Adventures of Tom Sawyer";
		b2.Author="Mark Twain";
		
				System.out.println("Page Count of the book:"+b2.pageCount);
				
		//q5: Create another Book object and update the total number of books.
		Book b4= new Book();
		b4.title ="Maha";
		b4.Author="Rajesh";
		b4.pageCount =970;
		totalbooks++;
		//q6:Print the details of the new book and the updated total number of books.
		System.out.println("Title: "+" "+b4.title +" by "+b4.Author);
		System.out.println("Page Count of the book:"+b4.pageCount);
		System.out.println("Total number of books:"+ totalbooks);
		
		


	}

}
