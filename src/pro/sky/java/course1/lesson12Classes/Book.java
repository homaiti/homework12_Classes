package pro.sky.java.course1.lesson12Classes;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int yearOfPublication;

    public Book(String nameBook, Author nameAuthor, int yearOfPublication) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }
    public Author getNameAuthor() {
        return nameAuthor;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
