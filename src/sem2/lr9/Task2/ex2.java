package sem2.lr9.Task2;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        EMatrix();
        EPrintColumn();
    }

    private static void EMatrix() {
        try {PrintMatrix(CreateMatrix());}
        catch(NegativeArraySizeException e){
            System.out.println("введен неверный размер матрицы ("+e+")");
            EMatrix();
        }
        catch(InputMismatchException e){
            System.out.println("введен неверный параметр матрицы ("+e+")");
            EMatrix();
        }
    }

    private static void EPrintColumn(){
        try{PrintColumn();}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("столбик за пределами матрицы ("+e+")");
            EPrintColumn();
        }
        catch(InputMismatchException e){
            System.out.println("введен неверный параметр столбика ("+e+")");
            EPrintColumn();
        }
    }

    private static int width;
    private static int height;
    private static int[][] MatrixStat;

    private static void PrintMatrix(int[][] Array) {
        for (int i = 0; i < height; i++) {//заполнение массива
            for (int j = 0; j < width; j++) {
                System.out.print("[" + (j+1) + "][" + (i+1) + "]=" + Array[j][i]+"\t"); //печать
            }
            System.out.println();
        }
    }
    private static int [][] CreateMatrix(){
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner
        System.out.print("введите ширину матрицы: "); // пользоватьелю
        width = id.nextInt(); // число строк которое необходимо вывести
        System.out.print("введите высоту матрицы: ");// пользоватьелю
        height = id.nextInt(); // число строк которое необходимо вывести
        int [][] Matrix = new int [width][height]; //создание элемента массива необходимого размера
        for (int i = 0 ; i <width; i++) {//заполнение массива
            for (int j = 0 ; j <height; j++) {
                Matrix[i][j] = random.nextInt(200); //подстановка случайных значений
            }
        }
        MatrixStat = Matrix;
        return Matrix;
    }
    private static void PrintColumn(){
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner
        System.out.print("выберите столбик матрицы: "); // пользоватьелю
        int column = id.nextInt();
        for(int i = 0; i<height;i++){
            System.out.print("[" + column + "][" + (i+1) + "]=" + MatrixStat[column-1][i]+"\n"); //печать
        }
    }
}