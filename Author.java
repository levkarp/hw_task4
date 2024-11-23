public class Author {
    String authorName;
    String authorSurname;



    public Author(String authorName,String authorSurname) {
        this.authorName=authorName;
        this.authorSurname=authorSurname;



    }

    @Override
    public String toString() {
        return "Author{" +
                "Имя автора='" + authorName + '\'' +
                ", Фамилия автора='" + authorSurname + '\'' +
                ", книга, написанная  автором=" +
                '}';
    }
}