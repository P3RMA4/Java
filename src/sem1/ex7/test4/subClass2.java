package sem1.ex7.test4;

public class subClass2 extends subClass {
    public int chisl;

    subClass2(subClass2 subClassObject3){
        super(subClassObject3.chr, subClassObject3.str);
        chisl = subClassObject3.chisl;
    }

    subClass2(char chrEx, String strEx, int intEx){
        super(chrEx, strEx);
        this.chisl = intEx;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Символ: " + this.getChr() + "\n" +
                "Строка: " + this.getStr() + "\n" +
                "Число: " + this.getInt() + "\n";
        return ClassNameAndFieldValue ;
    }

    public int getInt(){
        return chisl;
    }
}
