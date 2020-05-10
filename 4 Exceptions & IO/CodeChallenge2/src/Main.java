import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("src/hiddenMessage.txt"));

        StringBuilder hiddenMessage = new StringBuilder();

        while (input.hasNext()) {
            String lineOfText = input.nextLine();
            for (int i = 0; i < lineOfText.length(); i++) {
                char ch = lineOfText.charAt(i);
                if (Character.isUpperCase(ch)) {
                    if (ch == 'X') {
                        hiddenMessage.append(" ");
                    } else {
                        hiddenMessage.append(ch);
                    }
                }
            }
        }

        System.out.println("The hidden message from the file was : " + hiddenMessage);
    }
}
