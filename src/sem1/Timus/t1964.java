package sem1.Timus;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class t1964 {
    private int n;
    private int k;
    private int[] a;

    public t1964(){
        try(Scanner in = new Scanner(System.in)){
            n = in.nextInt();
            k = in.nextInt();
            a = new int[k];
            IntStream.range(0, k).forEach(i -> a[i] = in.nextInt());
        }
    }

    private int solve(){
        int result = Arrays.stream(a).sum() - n * (k - 1);
        return result < 0 ? 0 : result;
    }

    public void run(){
        System.out.println(solve());
    }

    public static void main(String[] args) {
        new t1964().run();
    }

}
