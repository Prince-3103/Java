import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] series = {"gameOfThrones", "breakingBad", "starngerThings"};
        String[] episode = {"redWedding", "ozymandis", "theSorcrer"};
        String[] character = {"robbStark", "walterWhite", "will"};

        String[][] favShow = {series, episode, character};

        favShow[2][0] = "jon snow";     // Access

        for(String[] show : favShow){
            for(String find : show){
                System.out.print(find + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
