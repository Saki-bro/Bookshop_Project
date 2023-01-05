public interface BookShopOperations {
    public abstract boolean insertBook(Book b);
    public abstract boolean removeBook(Book b); 
    public abstract void searchBook(String isbn);
    public abstract void showAllBooks();
}