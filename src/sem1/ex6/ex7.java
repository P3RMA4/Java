package sem1.ex6;
import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        char[] arrChars = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(ToInt.charInt(arrChars)));
    }
}

class ToInt {
    static int[] charInt (char[] arrChars) {
        int[] Int = new int[arrChars.length];

        for(int i = 0; i < arrChars.length; i++) {
            Int[i] = arrChars[i];
        }

        return Int;
    }
}
