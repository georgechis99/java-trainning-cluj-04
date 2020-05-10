import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers do you want to read?");
        int noOfIntegers = scanner.nextInt();
        scanner.nextLine();
        int[] integers = new int[noOfIntegers];
        for (int i = 0; i < noOfIntegers; i++){
            System.out.println("Integer #" + (i+1) + ": ");
            integers[i] = scanner.nextInt();
            scanner.nextLine();
        }
            ArrayCustomIterator arrayCustomIterator = new ArrayCustomIterator(noOfIntegers,integers);

        for (Iterator iterator = arrayCustomIterator.getIterator(); iterator.hasNext(); ) {
            int value = (int) iterator.next();
            if(!iterator.hasNext()){
                System.out.print(value + ".");
            }else{
                System.out.print(value + ",");
            }
        }
    }
}
