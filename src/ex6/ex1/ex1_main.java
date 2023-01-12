package ex6.ex1;

public class ex1_main {
    public static void main(String[] args) {
        ex1 cas = new ex1();
        cas.setSimv1('u');
        cas.showVal1();
        cas.setSimv2("privet");
        cas.showVal2();
        char[] chari = {'h', 'e', 'l', 'l', 'o'};
        cas.setSimv3(chari);
        char[] ch = {'z'};
        cas.setSimv3(ch);
        cas.showVal3();
    }
}
