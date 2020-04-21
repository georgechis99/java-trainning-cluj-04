//Write a program that prints the numbers from 1 to 100.
//But for multiples of 3 print "Fizz" instead of the number
//And for multimples of 5 print "Buzz"
//For multiples of 3 and 5 print "FizzBuzz"

public class Main {

    public static final String f = "Fizz";
    public static final String r = "Rizz";
    public static final String j = "Jazz";
    public static final String b = "Buzz";
    public static final String fb = "FizzBuzz";

    public static void main(String[] args) {

        //STAGE 1

        //int count = 0;
        for (int i = 1; i < 101; i++) {
            /*count ++;
            if(count > 20){
                System.out.println();
                count = 0;
            }*/
            //the commented out portion of the code is
            //just for the output to be more readable
            // (for it to fit into the console)
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(fb + ",");
                continue;
            } else if (i % 5 == 0) {
                System.out.print(b + ",");
                continue;
            } else if (i % 3 == 0) {
                System.out.print(f + ",");
                continue;
            }
            System.out.print(i + ",");
        }

        //STAGE 2

        System.out.println();
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0) {
                System.out.print(r + ",");
                continue;
            } else if (i % 11 == 0) {
                System.out.print(j + ",");
                continue;
            }
            System.out.print(i + ",");
        }
    }
}
