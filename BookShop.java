public class BookShop implements BookShopOperations{
    private String name;
    Book Books[]=new Book[100];
    BookShop()
    {
      
    }
    BookShop(String name){
        this.name=name;
    }
    
    void setName(String name){
        this.name=name;
    }

    public String getName() {

        return this.name;
    }
    public boolean insertBook(Book b){
        for(int i=0;i<Books.length;i++){
            if(Books[i]==null){
                Books[i]=b;
                
                System.out.println(b.getBookTitle()+" has been inserted.");
               
                return true;
            }
        }
        System.out.println("\n");
        System.out.println(b.getBookTitle()+"  has been can not be inserted.");
        System.out.println("\n");
        return false;
    }
   public boolean removeBook(Book b){
        for(int i=0;i<Books.length;i++){
            if(Books[i]!=null && Books[i].getIsbn().equals(b.getIsbn())){
                Books[i]=null;
                System.out.println(b.getBookTitle()+" has been removed.");
              
                return true;
            }
        }
        System.out.println(b.getBookTitle()+" has not been removed.");
        b.showDetails();
        return false;
    }
    public void searchBook(String isbn){
        boolean flag=true;
        for(int i=0;i<Books.length;i++){
            if(Books[i]!=null ){
                if(isbn.equals(Books[i].getIsbn())){    
                    System.out.println("Found This "+Books[i].getBookTitle()+" Book");
                  
                    flag=true;
                    break;
                }
                else{
                    flag= false;
                
                }
            }
        }
    
        if(flag==false){
          System.out.println("****..........****");
           System.out.println("Not found this "+isbn+" Book");
            System.out.println("****..........****");
          System.out.println("\n");

    }
}
    
    public void showAllBooks(){
        for (int i=0;i<Books.length;i++)
        {
            if(Books[i]!=null){
           
            Books[i].showDetails();
           
        }       
    }
}

} 