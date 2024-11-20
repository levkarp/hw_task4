
public class Book {
    String bookName;
    String author;
    int pageOfBook;
    double price;
    boolean isNew;
   // Author authorOfBook;

    public  Book (String bookName,String author, int pageOfBook,double price,boolean isNew){
        this.bookName=bookName;
        this.author=author;
        this.pageOfBook=pageOfBook;
        this.price=price;
        this.isNew=isNew;
    }

    public Book(String bookName, double price){
        //this.authorOfBook=authorOfBook;
        this.bookName=bookName;
        this.price=price;

    }

    public void printInfo(){
        System.out.printf("Название книги: %s, автор книги: %s, страниц: %d, цена: %f,",bookName,author,pageOfBook,price);
    }
    public String compareBooks(String bookName,String author){
       // StringBuilder sb=new StringBuilder();
        String authorBook=author+bookName;
        return authorBook;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", pageOfBook=" + pageOfBook +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }


}
