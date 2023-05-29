package sem1.ex4;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] ArrayZmeyka = new int[a][b];
        int hvost = 0;
        int telo = 10;
        int h = 0;
        for (int i = 0; h < ArrayZmeyka.length ; h++) {
            for (int j = 0; j <(ArrayZmeyka[i].length - hvost); j++) {
                ArrayZmeyka[i][j] = telo;
                telo++;
            }
            if(i< ArrayZmeyka.length-1) {
                i++;}
            for (int o=a-1; o > hvost; o--) {
                ArrayZmeyka[o][ArrayZmeyka[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;
        for (int i = 0; i < ArrayZmeyka.length; i++){
            int count = i+1;
            for (int j = 0; j < ArrayZmeyka[i].length; j++){
                System.out.print(ArrayZmeyka[i][j]+" ");
                z++;
            }
            System.out.println();
            z = 0;
        }
    }
}
