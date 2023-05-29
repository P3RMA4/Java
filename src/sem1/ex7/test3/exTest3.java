package sem1.ex7.test3;

public class exTest3 {
    public static void main(String[] args) {
        superClass superClassObject = new superClass(2);
        String className = superClassObject.toString();
        System.out.println(className);

        subClass1 subClassObject1 = new subClass1('s', 7);
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        subClass2 subClassObject2 = new subClass2("q", 'f',5);
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
