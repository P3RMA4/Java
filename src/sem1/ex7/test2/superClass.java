package sem1.ex7.test2;

public class superClass {
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
