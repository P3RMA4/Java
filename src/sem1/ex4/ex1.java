package sem1.ex4;

public class ex1 {
    public static void main(String[] args) {
        int rows = 11;
        int columns = 23;
        int z;
        for (int i = 1 ; i <= rows; i++){
            z = 0;
            for (int j = 1; j <=columns; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println();
        }
    }
}
