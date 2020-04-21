public class Main {

    public static void main(String[] args) {

        System.out.println(findPairs(new int[]{3, 2, -3, -2, 3, 0}));
        System.out.println(findPairs(new int[]{1, 1, 0, -1, -1}));
        System.out.println(findPairs(new int[]{5, 9, -5, 7, -5}));
    }

    public static int findPairs(int[] intArray) {
        int countOfPairs = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if ((intArray[i] == 0 || (intArray[j] == 0))) {
                    continue;
                }
                if (intArray[i] + intArray[j] == 0) {
                    countOfPairs++;
                    intArray[i] = 0;
                    intArray[j] = 0;
                    break;
                }
            }
        }
        return countOfPairs;
    }
}
