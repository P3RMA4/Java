package ex4;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = id.nextInt();
        System.out.print("Введите высоту прямоугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][width];
        int z = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <width; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            for (int j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println();
            z = 0;
        }
    }
}