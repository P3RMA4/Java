package sem1.ex7.test5;

public class subClass2 extends superClass {
    protected char chr;

    subClass2(String strEx, char chrEx){
        super(strEx);
        this.chr = chrEx;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Текст: " + this.getStr() + "\n" +
                "Символ: " + this.getChr() + "\n";
        return ClassNameAndFieldValue ;
    }

    public char getChr(){
        return chr;
    }
}
