package sem1.ex7.test4;

public class exTest4 {
    public static void main(String[] args) {
        superClass superClassObject = new superClass('A');
        String className = superClassObject.toString();
        System.out.println(className);

        subClass subClassObject1 = new subClass('S', "Mish");
        String subClassName1 = subClassObject1.toString();
        System.out.println(subClassName1);

        subClass2 subClassObject2 = new subClass2('D', "Ytka", 1);
        String subClassName24 = subClassObject2.toString();
        System.out.println(subClassName24);

        System.out.println("Конструктор копирования:\n");

        subClass2 subClassObject2_cop2 = new subClass2(subClassObject2);
        subClassObject2_cop2.chr = 'V';
        String subClassName2422 = subClassObject2_cop2.toString();
        System.out.println(subClassName2422);

        subClass2 subClassObject2_cop3 = new subClass2(subClassObject2);
        subClassObject2_cop3.str = "Sobaka";
        String subClassName2423 = subClassObject2_cop3.toString();
        System.out.println(subClassName2423);

        subClass2 subClassObject2_cop1 = new subClass2(subClassObject2);
        subClassObject2_cop1.chisl = 7;
        String subClassName242 = subClassObject2_cop1.toString();
        System.out.println(subClassName242);

        subClass2 subClassObject2_cop4 = new subClass2(subClassObject2);
        subClassObject2_cop4.str = "Koshka";
        subClassObject2_cop4.chisl = 277353;
        String subClassName244 = subClassObject2_cop4.toString();
        System.out.println(subClassName244);
    }
}
