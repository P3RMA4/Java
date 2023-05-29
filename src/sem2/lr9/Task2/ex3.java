package sem2.lr9.Task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        ESetArray();
        SumArray(StatArray);
    }
    private static byte[] StatArray;

    private static void ESetArray(){
        try{SetArray();}
        catch (InputMismatchException e){
            System.out.println("введите корректное значение ("+e+")");
            ESetArray();
        }
        catch (Exception e){
            System.out.println("ошибка ("+e+")");
            ESetArray();
        }

    }
    static class ByteRangeException extends InputMismatchException{
        ByteRangeException(){
            super("число за пределами диапазона byte");
        }
    }
    private static void EInput(int i) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("введите byte элемент массива "+"["+(i+1)+"]");
            int temp=0;
            try{
                temp=scan.nextInt();
                if(temp<-128||temp>127){
                    throw new ByteRangeException();}
            }catch(ByteRangeException e){
                System.out.println("значение за пределами диапазона byte ("+e+")");
                EInput(i);}
            StatArray[i] = (byte)temp;
        }
        catch(InputMismatchException e){
            System.out.println("введите число ("+e+")");
            EInput(i);}


    }
    private static void SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите размер массива");
        int a = scan.nextInt();
        StatArray = new byte[a];
        for(int i=0;i<a;i++){
            EInput(i);
        }
    }

    private static void SumArray(byte [] InputArray){
        int A=0;
        for (int j : InputArray) {
            A += (int) j;
        }
        System.out.println("сумма элементов массива = ["+(A)+"]");
    }
}
