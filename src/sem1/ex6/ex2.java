package sem1.ex6;

public class ex2 {
    public static void main(String[] args) {
        exm2 num = new exm2();

        System.out.println(num.a);
    }
}

class exm2{
    static int a = 0;
    exm2(){
        System.out.println(a);
        a++;
    }
}
