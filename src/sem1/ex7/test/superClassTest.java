package sem1.ex7.test;

public class superClassTest {
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
