package sem1.ex7.test2;

public class subClass extends sem1.ex7.test2.superClass {
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
