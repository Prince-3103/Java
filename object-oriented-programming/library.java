class book{
    static int totalNoOfBooks;
    String title;
    String author;
    int uniqueNum;

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
}

public class library{
    public static void main(String[] args) {
        
    }
}