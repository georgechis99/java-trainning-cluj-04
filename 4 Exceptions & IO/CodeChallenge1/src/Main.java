import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("src/phonebook.txt"));
        String contact;
        boolean checkAbbey = false, checkAbdul = false;
        while(input.hasNext()){
            contact = input.nextLine();
            String[] splitContact = contact.split(" ");
            if(splitContact[0].equals("Abbey")){
                System.out.println("Abbey's number is: " + splitContact[1]);
                checkAbbey = true;
            }
            if(splitContact[0].equals("Abdul")){
                System.out.println("Abdul's number is: " + splitContact[1]);
                checkAbdul = true;
            }
        }
        if(!checkAbbey){
            System.out.println("Abbey's number not in the file.");
        }
        if(!checkAbdul){
            System.out.println("Abdul's number not in the file.");
        }
    }
}
