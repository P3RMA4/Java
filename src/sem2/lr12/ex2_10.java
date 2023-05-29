package sem2.lr12;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ex2_10 {
    public static void main(String[] args) {
        int[] array1 = {11, 22, 33, 44, 55};
        int[] array2 = {44, 55, 66, 77, 88};
        List<String> strings = Arrays.asList("Один", "два", "Три", "Четыре", "пять","шесть","Семь");
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55);

        System.out.println("2. Общие элементы: " + Arrays.toString(findCommonNumbers(array1, array2)));
        System.out.println("3. Строки, начинающиеся с заглавной буквы: " + filterStringsStartingWithCapital(strings));
        System.out.println("4. Квадраты чисел: " + getSquares(numbers));
        System.out.println("5. Строки, содержащие подстроку 'ь': " + filterStringsContaining(strings, "ь"));
        System.out.println("6. Числа, делящиеся на 2: " + filterNumbersDivisibleBy(numbers, 2));
        System.out.println("7. Строки длиннее 4: " + filterStringsLongerThan(strings, 4));
        System.out.println("8. Числа больше 33: " + filterNumbersGreaterThan(numbers, 33));
        System.out.println("9. Строки, содержащие только буквы: " + filterStringsContainingOnlyLetters(strings));
        System.out.println("10. Числа меньше 44: " + filterNumbersLessThan(numbers, 55));
    }

    public static int[] findCommonNumbers(int[] array1, int[] array2) {
        return IntStream.of(array1)
                .filter(x -> IntStream.of(array2).anyMatch(y -> y == x))
                .toArray();
    }

    public static List<String> filterStringsStartingWithCapital(List<String> strings) {
        return strings.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsContaining(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersDivisibleBy(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsLongerThan(List<String> strings, int minLength) {
        return strings.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersGreaterThan(List<Integer> numbers, int minValue) {
        return numbers.stream()
                .filter(n -> n > minValue)
                .collect(Collectors.toList());
    }

    public static List<String> filterStringsContainingOnlyLetters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }

    public static List<Integer> filterNumbersLessThan(List<Integer> numbers, int maxValue) {
        return numbers.stream()
                .filter(n -> n < maxValue)
                .collect(Collectors.toList());
    }

}