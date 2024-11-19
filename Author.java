public class Author {
    String authorName;
    String authorSurname;
    Book authorBook;


    public Author(String authorName,String authorSurname,Book authorBook) {
        this.authorName=authorName;
        this.authorSurname=authorSurname;
        this.authorBook=authorBook;


    }

    @Override
    public String toString() {
        return "Author{" +
                "Имя автора='" + authorName + '\'' +
                ", Фамилия автора='" + authorSurname + '\'' +
                ", книга, написанная  автором=" + authorBook +
                '}';
    }
}