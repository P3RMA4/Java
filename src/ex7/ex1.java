package ex7;

public class ex1 {
    public static void main(String[] args) {
        superClassTest superClassObject = new superClassTest("код передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        subClassTest subClassObject1 = new subClassTest("код передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        subClassTest subClassObject2 = new subClassTest("код передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}

class superClassTest {
    private String str1;
    superClassTest(String strEx){
        this.str1 = strEx;
    }
    superClassTest() {
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue ;
    }
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

class subClassTest extends superClassTest {
    private String str2;
    private String str3;
    subClassTest(String strEx) {
        super(strEx);
    }
    subClassTest(String strEx2, String strEx3){
        this.str2 = strEx2;
        this.str3 = strEx3;
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2 + "\n" +
                " str 3 = " + this.str3;
        return ClassNameAndFieldValue ;
    }
    public String getStr3() {
        return str3;
    }
    public void setStr3(String str3) {
        this.str3 = str3;
    }
    public String getStr2() {
        return str2;
    }
    public void setStr2(String str2) {
        this.str2 = str2;
    }
}