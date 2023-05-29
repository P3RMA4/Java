package sem1.ex4;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][];
        for (int i = 0; i < graph.length; i++){
            int j = i+1;
            graph[i]=new int[j];
        }
        int z = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <i+1; j++){
                graph[i][j] = 7;
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            for (int j = 0; j < graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println();
            z = 0;
        }
    }
}
