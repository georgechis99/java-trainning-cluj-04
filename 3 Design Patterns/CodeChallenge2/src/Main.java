import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers do you want to read?");
        int noOfIntegers = scanner.nextInt();
        scanner.nextLine();

        Integer[] array;
        array = initializeArray(noOfIntegers);

        Integer[] copy1OfArr = Arrays.copyOf(array,array.length);
        Integer[] copy2OfArr = Arrays.copyOf(array,array.length);

        displaySorted(new BubbleSort(),copy1OfArr);
        displaySorted(new MergeSort(),copy2OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        if (strategy instanceof BubbleSort) {
            strategy.sort(arr);
            displayArray(arr);
        }else if(strategy instanceof MergeSort){
            strategy.sort(arr);
            displayArray(arr);
        }
    }

    public static void displayArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ; ");
        }
        System.out.println();
    }

    public static Integer[] initializeArray(int noOfIntegers){
        Integer[] bufferArray = new Integer[noOfIntegers];
        for (int i = 0; i < noOfIntegers; i++) {
            System.out.println("Integer #" + (i + 1) + ": ");
            bufferArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return bufferArray;
    }
}
