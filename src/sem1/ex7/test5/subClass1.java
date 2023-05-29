package sem1.ex7.test5;


public class subClass1 extends superClass {
    protected int chisl;

    subClass1(String strEx, int intEx){
        super(strEx);
        this.chisl = intEx;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Текст: " + this.getStr() + "\n" +
                "Число: " + this.getInt() + "\n";
        return ClassNameAndFieldValue ;
    }

    public int getInt(){
        return chisl;
    }
}
