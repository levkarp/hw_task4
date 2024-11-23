import java.util.Scanner;

public class Book { //TODO придумать ещё 1-2 метода
    Scanner sc = new Scanner(System.in);
    int pageStopInput;
    String bookName;
    int currentPage;
    int pageOfBook;
    double price;
    boolean isNew;
    Author authorOfBook;
    String author;
    //String author=getFullNameAuthor(); если метод не зависит от данных в констр-ре

    public String getFullNameAuthor() {
        if (authorOfBook != null) {

            if (authorOfBook.authorName != null & authorOfBook.authorSurname != null) {
                return authorOfBook.authorName + " " + authorOfBook.authorSurname;
            }
        }
        return "автор неизвестен";

    }

    public Book(String bookName, int pageOfBook, double price, boolean isNew, Author authorOfBook) {
        this.authorOfBook = authorOfBook;
        this.bookName = bookName;
        this.author = getFullNameAuthor();// использ метод в констр, если при созд поле объекта зависит от изменяемых данных
        this.pageOfBook = pageOfBook;
        this.price = price;
        this.isNew = isNew;

    }

    public Book(String bookName, double price) {
        //this.authorOfBook=authorOfBook;
        this.bookName = bookName;
        this.price = price;

    }

    public Book(String bookName, int currentPage) {
        this.bookName = bookName;
        this.currentPage = currentPage;
    }

    public void checkPage() {
        System.out.println("Введите номер страницы на которой остановились");
        int pageInput = sc.nextInt();
        if (pageInput == pageStopInput) {
            System.out.println("Вы ввели правильную страницу, продолжаем с этого места");
            // TODO метод открывающий книгу
        } else {
            System.out.println("Вы ввели не правильную страницу, открываем первую страницу");
            // TODO метод открывающий первую сираницу книги
        }
    }

    public int readBook() {
        System.out.println("Введите номер страницы на которой закончили чтение!!");
        pageStopInput = sc.nextInt();

        System.out.println("читаем книгу " + bookName);
        System.out.println("остановились на " + pageStopInput);
        return pageStopInput;
    }


    public void compareBooks(Book book2) {
        // StringBuilder sb=new StringBuilder();


        if (pageOfBook > book2.pageOfBook) {
            System.out.println(bookName + " толще на " + (pageOfBook - book2.pageOfBook) + " страницы");

        } else {
            System.out.println(book2.bookName + " толще на " + (book2.pageOfBook - pageOfBook) + " страницы");
        }
    }


    @Override
    public String toString() {
        return
                "bookName='" + bookName + '\'' +
                        ", author='" + author + '\'' +
                        ", pageOfBook=" + pageOfBook +
                        ", price=" + price +
                        ", isNew=" + isNew + "текущая страница=" + currentPage;
    }


}
