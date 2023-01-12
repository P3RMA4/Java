package Timus;
import java.util.Scanner;

public class t1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 1 & n <= 4){
            System.out.print("few");
        }else if (n >= 5 & n <= 9) {
            System.out.print("several");
        }else if (n >= 10 & n <= 19) {
            System.out.print("pack");
        }else if (n >= 20 & n <= 49) {
            System.out.print("lots");
        }else if (n >= 50 & n <= 99) {
            System.out.print("horde");
        }else if (n >= 100 & n <= 249) {
            System.out.print("throng");
        }else if (n >= 250 & n <= 499) {
            System.out.print("swarm");
        }else if (n >= 500 & n <= 999) {
            System.out.print("zounds");
        }else if (n >= 1000) {
            System.out.print("legion");
        }
    }
}