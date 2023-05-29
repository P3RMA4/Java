package sem1.ex7.test4;

public class superClass {
    public char chr;

    superClass(superClass superClassObject){
        chr = superClassObject.chr;
    }
    superClass(char chrEx){
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
