package sem1.ex7.test3;

public class subClass2 extends sem1.ex7.test3.subClass1 {
    public String str;

    subClass2(String strEx, char chrEx, int intEx){
        super(chrEx, intEx);
        this.str = strEx;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Число: " + this.getInt() + "\n" +
                "Символ: " + this.getChr() + "\n" +
                "Текст: " + this.str + "\n";
        return ClassNameAndFieldValue ;
    }
}
