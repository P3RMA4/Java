package sem1.ex7.test5;

public class superClass {
    protected String str;

    superClass(String strEx){
        this.str= strEx;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Текст: " + this.getStr() + "\n";
        return superClassNameAndFieldValue ;
    }

    public String getStr(){
        return str;
    }
}
