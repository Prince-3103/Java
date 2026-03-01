
class Book{
    static int totalNoOfBooks;
    String title;
    String author;
    int uniqueNum;
    boolean isBorrowed;

    static{
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }

    Book(int uniqueNum, String title, String author){
        this.uniqueNum = uniqueNum;
        this.title = title;
        this.author = author;
    }

    Book(int uniqueNum){    // Giving default value to title and author unique num important
        this(uniqueNum, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Enjoy your book");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Thanks for returning book, Please leave a reviesw");
        }
        else{
            System.out.println("This book already in library.");
        }
    }
}

public class library{
    public static void main(String[] args) {
        Book asowaf = new Book(1, "Winds of Winter", "George RR Martin");
        Book myBook = new Book(2);

        System.out.println(Book.getTotalNoOfBooks());
        asowaf.borrowBook();
        myBook.borrowBook();
        asowaf.borrowBook();
        asowaf.returnBook();
        asowaf.returnBook();
    }
}