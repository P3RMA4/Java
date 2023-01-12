package ex6.ex1;
public class ex1 {
    char a = '0';
    String b = "0";

    void setSimv1 (char a) {
        this.a = a;
    }
    void setSimv2(String b) {
        this.b = b;
    }
    void setSimv3(char[] chari) {
        if(chari.length>1) {
            this.b = new String(chari);
        } else {
            this.a = chari[0];
        }
    }
    void showVal1 () {
        System.out.println("Символ - " + a);
    }
    void showVal2 () {
        System.out.println("Строка - " + b);
    }
    void showVal3 () {
        System.out.println("Символьный массив из одного символа - " + a + "\nСтрока из символьного массива - " + b);
    }
}
