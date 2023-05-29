package sem1.ex7.test2;

public class exTest2 {
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
