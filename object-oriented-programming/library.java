class book{
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

    book(int uniqueNum, String title, String author){
        this.uniqueNum = uniqueNum;
        this.title = title;
        this.author = author;
    }

    book(int uniqueNum){    // Giving default value to title and author unique num important
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
}

public class library{
    public static void main(String[] args) {
        
    }
}