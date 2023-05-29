package sem1.ex4;

public class ex2 {
    public static void main(String[] args) {
        int height = 7;
        int z = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= z; j++) {
                System.out.print("+");
            }
            z = z + 1;
            System.out.println();
        }
    }
}
