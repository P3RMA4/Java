package ex7;

public class ex4 { public static void main(String[] args) {
    superClass4 superClassObject = new superClass4('A');
    String className = superClassObject.toString();
    System.out.println(className);

    subClass14 subClassObject1 = new subClass14('S', "Mish");
    String subClassName1 = subClassObject1.toString();
    System.out.println(subClassName1);

    subClass24 subClassObject2 = new subClass24('D', "Ytka", 1);
    String subClassName24 = subClassObject2.toString();
    System.out.println(subClassName24);

    System.out.println("Конструктор копирования:\n");

    subClass24 subClassObject2_cop2 = new subClass24(subClassObject2);
    subClassObject2_cop2.chr = 'V';
    String subClassName2422 = subClassObject2_cop2.toString();
    System.out.println(subClassName2422);

    subClass24 subClassObject2_cop3 = new subClass24(subClassObject2);
    subClassObject2_cop3.str = "Sobaka";
    String subClassName2423 = subClassObject2_cop3.toString();
    System.out.println(subClassName2423);

    subClass24 subClassObject2_cop1 = new subClass24(subClassObject2);
    subClassObject2_cop1.chisl = 7;
    String subClassName242 = subClassObject2_cop1.toString();
    System.out.println(subClassName242);

    subClass24 subClassObject2_cop4 = new subClass24(subClassObject2);
    subClassObject2_cop4.str = "Koshka";
    subClassObject2_cop4.chisl = 277353;
    String subClassName244 = subClassObject2_cop4.toString();
    System.out.println(subClassName244);
}
}

class superClass4 {
    public char chr;

    superClass4(superClass4 superClassObject){
        chr = superClassObject.chr;
    }
    superClass4(char chrEx){
        this.chr = chrEx;
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Символ: " + this.getChr() + "\n" +
                "Строка: " + null + "\n" +
                "Число: " + null + "\n";
        return superClassNameAndFieldValue ;
    }

    public char getChr(){
        return chr;
    }
}

class subClass14 extends superClass4 {
    public String str;

    subClass14(subClass14 subClassObject1){
        super(subClassObject1.chr);
        str = subClassObject1.str;
    }

    subClass14(char chrEx, String strEx){
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

class subClass24 extends subClass14 {
    public int chisl;

    subClass24(subClass24 subClassObject3){
        super(subClassObject3.chr, subClassObject3.str);
        chisl = subClassObject3.chisl;
    }

    subClass24(char chrEx, String strEx, int intEx){
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