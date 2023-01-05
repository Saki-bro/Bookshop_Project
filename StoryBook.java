public class StoryBook extends Book {
    
    private String category;
    
    StoryBook(){
    }
    StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category){
        
        super(isbn,bookTitle,authorName,price,availableQuantity);
        this.category=category;
    }
    
    public void setCategory(String category){
        this.category=category;
    }
   
    public String getCategory(){
        return this.category;
    }
    
    void showDetails() {
        System.out.println("	 .....Story Book.....\n");
        System.out.println("Book Category    	 : " + this.getCategory());
        System.out.println("ISBN             	 : "  + this.getIsbn());
        System.out.println("Book Title 		 : " + this.getBookTitle());
        System.out.println("Book Author 		 : " + this.getAuthorName());
        System.out.println("Book Price 		 : " + this.getPrice());
        System.out.println("Book Avaiable Quantity   : " + this.getAvailableQuantity());
        System.out.println("\n");
		System.out.println("  ********************************");
        System.out.println("\n");
    }

}