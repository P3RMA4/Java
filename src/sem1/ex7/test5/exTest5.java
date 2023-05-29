package sem1.ex7.test5;

public class exTest5 {
    public static void main(String[] args) {
        superClass superClassObject = new superClass("Cat");
        String className = superClassObject.toString();
        System.out.println(className);

        subClass1 subClassObject1 = new subClass1("Dog", 5);
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        subClass2 subClassObject2 = new subClass2("Mouse", 'E');
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
