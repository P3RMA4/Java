package ex4;
import java.util.Random;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Random random = new Random(777);
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = id.nextInt();
        int firstArray[][] = new int[a][b];
        for (int i = 0 ; i < a; i++) {
            for (int j = 0 ; j < b; j++) {
                firstArray[i][j] = random.nextInt(777);
                System.out.println("i = " + i + "; j = " + j + "; value = " + firstArray[i][j]);
            }
        }
        System.out.println("\n==========================");
        int deleteI = random.nextInt(a-1);
        int deleteJ = random.nextInt(b-1);
        System.out.println("delete_I = " + deleteI + "; delete_J = " + deleteJ);
        System.out.println("==========================\n");
        int secondArray[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i < a-1; s++) {
            if (s != deleteI){
                for (int j = 0, k = 0 ; j < b-1; k++) {
                    if (k != deleteJ) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + "; j = " + j + "; value = " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
