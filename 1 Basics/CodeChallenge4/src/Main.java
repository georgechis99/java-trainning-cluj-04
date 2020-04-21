public class Main {

    public static void main(String[] args) {

        System.out.println(findPairs(new int[]{-1, -1, -1, 2}));
    }

    public static int findPairs(int[] intArray) {
        int countOfPairs = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                for (int l = j + 1; l < intArray.length; l++) {
                    if ((intArray[i] == 0 || (intArray[j] == 0) || (intArray[l] == 0))) {
                        continue;
                    }
                    if (intArray[i] + intArray[j] + intArray[l] == 0) {
                        countOfPairs++;
                        intArray[i] = 0;
                        intArray[j] = 0;
                        intArray[l] = 0;
                        break;
                    }
                }
            }
        }
        return countOfPairs;
    }
}