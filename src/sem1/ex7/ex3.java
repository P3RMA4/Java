package sem1.ex7;

public class ex3 {  public static void main(String[] args) {
    superClas superClassObject = new superClas(2);
    String className = superClassObject.toString();
    System.out.println(className);

    subClass1 subClassObject1 = new subClass1('s', 3);
    String subClassName1 = subClassObject1.toString();
    System.out.println(subClassName1);

    subClass2 subClassObject2 = new subClass2("q", 'f',5);
    String subClassName2 = subClassObject2.toString();
    System.out.println(subClassName2);
}
}

class superClas {
    public int chisl1;

    superClas(int intEx){
        this.chisl1 = intEx;
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Число: " + this.getInt() + "\n";
        return superClassNameAndFieldValue ;
    }

    public int getInt(){
        return chisl1;
    }

    public void setInt(int chisl1){
        this.chisl1 = chisl1;
    }
}

class subClass1 extends superClass {
    public char chr1;
    public int chisl2;

    subClass1(char charEx, int intEx){
        this.chr1 = charEx;
        this.chisl2 = intEx;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Число: " + this.getChisl2() + "\n" +
                "Символ: " + this.getChr() + "\n";
        return ClassNameAndFieldValue ;
    }

    public int getChisl2(){
        return chisl2;
    }
    public char getChr(){
        return chr1;
    }

    public void setChr(char chr1){
        this.chr1 = chr1;
    }
}

class subClass2 extends subClass1 {
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
                "Число: " + this.getChisl2() + "\n" +
                "Символ: " + this.getChr() + "\n" +
                "Текст: " + this.str + "\n";
        return ClassNameAndFieldValue ;
    }
}