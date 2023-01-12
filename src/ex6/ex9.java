package ex6;

import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        System.out.println(Arrays.toString(arr));
        Reverse.reverse(arr);
        System.out.println(Arrays.toString(arr));
        Reverse.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Reverse {
    static void reverse (char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}