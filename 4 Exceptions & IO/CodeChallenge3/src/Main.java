//printing the anagrams of the word "listen"

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("src/words.txt"));

        System.out.println("The anagrams of the word 'listen' contained by the file are: ");
        System.out.println();

        while(input.hasNext()){
            String line = input.nextLine();
            String word;
            String[] splitLine = line.split(" ");
            for (String s : splitLine) {
                word = s;
                if (word.length() == 6) {
                    if (word.contains("l") && word.contains("i") && word.contains("s") && word.contains("t") && word.contains("e") && word.contains("n")) {
                        System.out.println(word);
                    }
                }
            }
        }
    }
}
