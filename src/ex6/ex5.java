package ex6;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Первый способ:\n" + Sum.fact(a));
        System.out.println("Через рекрусию:\n" + SumRec.fact(a));
    }
}

class Sum {
    static int fact (int a) {
        int c = 0;
        for(int i = 1; i <= a; i++) {
            c += Math.pow(i, 2);
        }
        return c;
    }
}

class SumRec {
    static int fact (int a) {
        double c;
        if(a==1) {
            return 1;
        }
        c = fact(a-1) + Math.pow(a,2);
        return (int)c;
    }
}