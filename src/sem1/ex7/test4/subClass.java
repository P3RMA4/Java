package sem1.ex7.test4;

public class subClass extends superClass {
    public String str;

    subClass(subClass subClassObject1){
        super(subClassObject1.chr);
        str = subClassObject1.str;
    }

    subClass(char chrEx, String strEx){
        super(chrEx);
        this.str = strEx;
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Символ: " + this.getChr() + "\n" +
                "Строка: " + this.getStr() + "\n" +
                "Число: " + null + "\n";
        return ClassNameAndFieldValue ;
    }

    public String getStr(){
        return str;
    }
}
