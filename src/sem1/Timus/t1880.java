package sem1.Timus;
import java.util.*;

public class t1880 {

    public static void main(String str[]) {
        Scanner input = new Scanner(System.in);

        final int n1 = input.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        final int n2 = input.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        final int n3 = input.nextInt();
        int arr3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = input.nextInt();
        }

        Deque<Integer> match = new LinkedList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] < arr2[j])
                    break;

                if (arr1[i] == arr2[j]) {
                    match.addLast(arr1[i]);
                    break;
                }
            }
        }

        int result = 0;
        for (Integer next : match) {

            for (int j = 0; j < n3; j++) {
                if (next < arr3[j])
                    break;

                if (next == arr3[j])
                    result++;

            }
        }

        System.out.println(result);
    }
}