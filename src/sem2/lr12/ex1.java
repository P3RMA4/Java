package sem2.lr12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ex1 {

    public static void main(String[] args) {
        int[] inputArray = {11,22,33,44,55,66,77,88,99};
        int[] evenArray = filterEvenNumbers(inputArray);

        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        System.out.println("Массив с четными числами: " + Arrays.toString(evenArray));
    }

    public static int[] filterEvenNumbers(int[] inputArray) {
        return IntStream.of(inputArray)
                .filter(number -> number % 2 == 0)
                .toArray();
    }
}