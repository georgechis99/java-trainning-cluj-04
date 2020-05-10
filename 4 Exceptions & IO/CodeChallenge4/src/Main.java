import java.io.*;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Main {

    public static final String ONE = "\n|\n|";
    public static final String TWO = " _\n _|\n|_";
    public static final String THREE = "_\n_|\n_|";
    public static final String FOUR = "|_|\n  |";
    public static final String FIVE = " _\n|_\n _|";
    public static final String SIX = " _\n|_\n|_|";
    public static final String SEVEN = "_\n |\n |";
    public static final String EIGHT = " _\n|_|\n|_|";
    public static final String NINE = " _\n|_|\n _|";
    public static final String ZERO = " _\n| |\n|_|";

    public static final String[] digits = new String[10];

    public static void main(String[] args) throws IOException {

        digits[0] = ZERO;
        digits[1] = ONE;
        digits[2] = TWO;
        digits[3] = THREE;
        digits[4] = FOUR;
        digits[5] = FIVE;
        digits[6] = SIX;
        digits[7] = SEVEN;
        digits[8] = EIGHT;
        digits[9] = NINE;

        Scanner input = new Scanner(new File("src/input.txt"));
        Writer output = new FileWriter("src/output.txt");

        StringBuilder digitalFormat = new StringBuilder();
        String textNumber = input.nextLine();
        for(int i = 0; i < textNumber.length(); i++){
            int digit = Integer.parseInt(String.valueOf(textNumber.charAt(i)));
            digitalFormat.append(digits[digit]);
            System.out.println(digits[digit]);
        }
        output.write(digitalFormat.toString());
        output.flush();
        output.close();
    }
}
