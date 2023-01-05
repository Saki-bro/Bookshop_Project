public class Start{
  public static void main(String[] args) {
    BookShop a= new BookShop();
    a.setName("MY BOOK SHOP");

		System.out.println("\n\n\n         MY BOOK SHOP\n\n\n");
		StoryBook sb1 = new StoryBook("978-3-23-55875-4","Harry Potter","J. K. Rowling",350.00,100,"Novel");
		StoryBook sb2 = new StoryBook("978-34-42645-3", "The Silent Patient", "Alex Michaelides",720.00, 250,"Thrillar");
		StoryBook sb3 = new StoryBook("978-0-043436-4","The Hobbit","J. R. R. Tolkien",130.00,90,"Mistry");
		StoryBook sb4 = new StoryBook("978-0-0454536-4","Death of a City", "Amrita Pritam",420.50,150,"Thrillar");
		StoryBook sb5 = new StoryBook("978-0-054346-4","A Tale of Two Cities","Charles Darwin",350.00,120,"Novel");
		
		TextBook tb1 = new TextBook("978-3-16-14841-0","Java Programming","A.N.M Bajlur Rahman",620.00,800,01);	
		TextBook tb2 = new TextBook("978-8-78-85361-7","Computer programming", "Shariar Subin", 320.00,1000, 02 );
		TextBook tb3 = new TextBook("978-0-05-43446-4","Man’s Search for Meaning", "Viktor Frankel", 800.00, 15, 3);
		TextBook tb4 = new TextBook("978-8-78-85363-9","The One Minute Manager", "Kenneth Blanchard", 430.00, 36, 4);
		TextBook tb5 = new TextBook();
			tb5.setIsbn("978-8-78-85365-4");
			tb5.setBookTitle("The Lean Start-Up");
			tb5.setAuthorName("Eric Ries");
			tb5.setPrice(750.0);
			tb5.setAvailableQuantity(66);
			tb5.addQuantity(34);
			tb5.sellQuantity(40);
			tb5.setStandard(2);
		
		
		a.insertBook(sb1);
		a.insertBook(sb2);
		a.insertBook(sb3);
		a.insertBook(sb4);
		a.insertBook(sb5);
		
		a.insertBook(tb1);
		a.insertBook(tb2);
		a.insertBook(tb3);
		a.insertBook(tb4);
		a.insertBook(tb5);
		
		
		
		a.removeBook(tb5);
		a.searchBook("978-8-78-85363-9");
   
    
  
		a.showAllBooks();
   
    
}
}