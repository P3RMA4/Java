package sem1.ex7;

public class ex5 {
    public static void main(String[] args) {
        superClass5 superClassObject = new superClass5("Cat");
        String className = superClassObject.toString();
        System.out.println(className);

        subClass15 subClassObject1 = new subClass15("Dog", 5);
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        subClass25 subClassObject2 = new subClass25("Mouse", 'E');
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

class superClass5 {
    protected String str;

    superClass5(String strEx){
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

class subClass15 extends superClass5 {
    protected int chisl;

    subClass15(String strEx, int intEx){
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

class subClass25 extends superClass5 {
    protected char chr;

    subClass25(String strEx, char chrEx){
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