package ex7;
public class ex2 {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("код передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        subClass subClassObject1 = new subClass("код передал в конструктор подкласса с текстовым параметром");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClass subClassObject2 = new subClass(7);
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);

        subClass subClassObject3 = new subClass("код передал в конструктор подкласса, где два параметра str и int", 777);
        String subClassName3 = subClassObject3.toString();
        System.out.println(subClassName3);
    }
}

class superClass {
    private String str1;
    superClass(String strEx) {
        this.str1 = strEx;
    }
    superClass(){
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Текст 1: " + this.getStr1() + "\n" +
                "Длина слова = " + this.toInt() + "\n";
        return superClassNameAndFieldValue ;
    }
    public int toInt(){
        int c = 0;
        for (int i = 1; i <= str1.length(); i++){
            c++;
        }
        return c;
    }
    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

class subClass extends superClass {
    public int chisl;
    private String str2;

    subClass(){
    }

    subClass(String strEx){
        this.str2 = strEx;
    }

    subClass(int intEx){
        this.chisl = intEx;
    }

    subClass(String strEx1, int intEx1){
        this.chisl = intEx1;
        this.str2 = strEx1;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "Вывод: " + "\n" +
                "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "Текст 1: " + this.getStr1() + "\n" +
                "Текст 2: " + this.getStr2() + "\n" +
                "Длина слова = " + this.toInt() + "\n" +
                "Число:   " + this.chisl + "\n";
        return ClassNameAndFieldValue ;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2){
        this.str2 = str2;
    }

    public int toInt(){
        int c = 0;
        if (str2 != null) {
            for (int i = 1; i <= str2.length(); i++) {
                c++;
            }
        }else {
            c = 0;
        }
        return c;
    }
}