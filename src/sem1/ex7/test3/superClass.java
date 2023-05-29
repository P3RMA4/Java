package sem1.ex7.test3;

public class superClass {
    public int chisl1;

    superClass(int intEx){
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
