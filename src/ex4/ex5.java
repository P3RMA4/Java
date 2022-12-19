package ex4;
import java.util.Random;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Random random = new Random(777);
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество  столбцов массива: ");
        int a = id.nextInt();
        System.out.print("Введите количество строк массива: ");
        int b = id.nextInt();
        System.out.println("\nПервый массив: ");
        int[][] firstArray = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(777);
                System.out.println("i = "+i+"; j= "+j+"; value= "+firstArray[i][j]);
            }
        }
        System.out.println("\nВторой массив: ");
        int[][] secondArray = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.println("i = "+i+";j= "+j+";value= "+secondArray[i][j]);
            }
        }
    }
}
