package pro.sky.java.course1.lesson12Classes_13ObjectMethotds;

public class Main {

    //Задание средней сложности
    public static void addBook(Book[] newArray, Book newBook){
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == null) {
                newArray[i] = newBook;
                return;
            }

        }

    }
    //Задание средней сложности
    public static void printBook(Book[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] == null) {
                return;
            }
            System.out.print(newArray[i].getAuthor().getFirstName() + " " + newArray[i].getAuthor().getLastName()
                    + ": " + newArray[i].getNameBook() + ": " + newArray[i].getYearOfPublication());
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Author joraOruel = new Author("George", "Orwell");
        Author chakiPolovnik = new Author("Chuck", "Palahniuk");
        Book firstBook = new Book("1984", joraOruel, 1949);
        Book secondBook = new Book("Fight Club", chakiPolovnik, 1996);

        firstBook.setYearOfPublication(1945);
        System.out.println(firstBook.getYearOfPublication());
        System.out.println();

        //Задание средней сложности
        Book[] bookArray = new Book[7];
        bookArray[0] = firstBook;
        bookArray[1] = secondBook;
        Author davaJora = new Author("Jerome", "Salinger");
        Book thirdBook = new Book("The Catcher in the Rye", davaJora, 1951);
        addBook(bookArray, thirdBook);
        printBook(bookArray);


    }
}
