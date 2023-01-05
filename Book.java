public abstract class Book implements BookOperations{

    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;

    Book() {

    }
    Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;

    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
    public int getAvailableQuantity() {

        return this.availableQuantity;
    }
    public void addQuantity(int amount) {
        if(0<=amount){
            this.availableQuantity=this.availableQuantity+amount;
        }
        else{
            System.out.println("[ "+amount+" book add not possible ]");
        } 

    }
    public void sellQuantity(int amount) {
        if(this.availableQuantity>=amount){
            this.availableQuantity = this.availableQuantity - amount;
        }
        else{
            System.out.println("[ "+amount+ " pcs book not available ]");
        }
    }
    public void setCategory(String category){
    }
    public String getCategory(){
        return "";
    }
    public void setStandard(int standard) {
        
    }
    public int getStandard() {
        return 0;
        }
        
    abstract void showDetails();

}