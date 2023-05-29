package sem1.ex7.test3;

public class subClass1 extends superClass {
    public char chr1;

    subClass1(char charEx, int intEx){
        super(intEx);
        this.chr1 = charEx;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Число: " + this.getInt() + "\n" +
                "Символ: " + this.getChr() + "\n";
        return ClassNameAndFieldValue ;
    }

    public char getChr(){
        return chr1;
    }

    public void setChr(char chr1){
        this.chr1 = chr1;
    }
}
