package sem1.OPD;
import java.util.Scanner;

public class LR5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите минимальную трудоемкость для одного экрана:");
        int num1 = in.nextInt();
        System.out.println("Введите максимальную трудоемкость для одного экрана:");
        int num2 = in.nextInt();
        System.out.println("Введите наиболее вероятную трудоемкость для одного экрана:");
        int num3 = in.nextInt();
        System.out.println("Введите минимальную трудоемкость для одного обработчика событий");
        int num4 = in.nextInt();
        System.out.println("Введите максимальную трудоемкость для одного обработчика событий");
        int num5 = in.nextInt();
        System.out.println("Введите наиболее вероятную трудоемкость для одного обработчика событий");
        int num6 = in.nextInt();
        System.out.println("Введите минимальную трудоемкость для нового бизнес-объекта:");
        int num7 = in.nextInt();
        System.out.println("Введите максимальную трудоемкость для нового бизнес-объекта:");
        int num8 = in.nextInt();
        System.out.println("Введите наиболее вероятную трудоемкость для нового бизнес-объекта:");
        int num9 = in.nextInt();
        System.out.println("Введите минимальную трудоемкость для добавления нового бизнес-метода:");
        int num10 = in.nextInt();
        System.out.println("Введите максимальную трудоемкость для добавления нового бизнес-метода:");
        int num11 = in.nextInt();
        System.out.println("Введите наиболее вероятную трудоемкость для добавления нового бизнес-метода:");
        int num12 = in.nextInt();
        Methods methods = new Methods();
        int [] screen = new int[]{num1,num2,num3};
        int [] event  = new int[]{num4,num5,num6};
        int [] businessObject = new int[]{num7,num8,num9};
        int [] newBusinessMethod = new int[]{num10,num11,num12};
        methods.valueScaner();

        System.out.print("Оценку средней трудоемкости кодирования по каждому элементарному пакету: \n");
        System.out.printf(" - трудоемкомть кодирования для экранов чел.час: %s \n",methods.mLC(screen));
        System.out.printf(" - трудоемкомть кодирования для обработчиков событий чел.час: %s \n",methods.mLC(event));
        System.out.printf(" - трудоемкомть кодирования для бизнес объектов чел.час: %s \n",methods.mLC(businessObject));
        System.out.printf(" - трудоемкомть кодирования для бизнес методов чел.час: %s \n",methods.mLC(newBusinessMethod));

        System.out.println("Среднеквадратное отклонение:");
        System.out.printf(" - для экранов чел.час: %s \n" ,methods.mD(screen));
        System.out.printf(" - обработчиков событий чел.час: %s \n",methods.mD(event));
        System.out.printf(" - для бизнес объектов чел.час: %s \n",methods.mD(businessObject));
        System.out.printf(" - для новых бизнес методов чел.час: %s \n",methods.mD(newBusinessMethod));

        System.out.print("Суммарная трудоемкость проекта чел.час: ");
        System.out.println(methods.sL( methods.mLC(screen),  methods.mLC(event),  methods.mLC(businessObject), methods.mLC(newBusinessMethod)));

        System.out.print("Среднеквадратичное отклонение для оценки суммарной трудоемкости кодирования чел.час : ");
        System.out.println(methods.summD(methods.mD(screen),methods.mD(event),methods.mD(businessObject),methods.mD(newBusinessMethod)));

        System.out.print("Суммарной трудоемкости кодирования проекта чел.час: ");
        System.out.println(methods.sD());

        System.out.print("Относительная погрешность в оценке суммарной трудоемкости кодирования чел.час: ");
        System.out.println(methods.esD() + "%");

        System.out.print("Расчёт общей трудоёмкости чел.час: ");
        System.out.println(methods.ssD());

        System.out.print("Пересчёт человеко-часов в человеко-месяцы: ");
        System.out.println(methods.rP());

        System.out.print("Закон Барии Боэма (Barry Boehm) месяцев: ");
        System.out.println(methods.lw());

        System.out.print("Средняя численность команды человек : ");
        System.out.println(methods.mP());
    }
}

class Methods{
    static Scanner in = new Scanner(System.in);
    int [] data = new int[4];
    public void valueScaner (){
        for (int j = 0; j < 1; j++){
            for (int i = 0; i< data.length; i++){
                System.out.println("новое разрабатываемое приложение содержит");
                switch (i) {
                    case 0 -> System.out.print("пользовательские экраны: ");
                    case 1 -> System.out.print("обработчики событий: ");
                    case 2 -> System.out.print("новые бизнес-объекты: ");
                    case 3 -> System.out.print("новые бизнесметоды: ");
                }
                data[i] = in.nextInt();
            }
        }
    }

    private double mLC;
    private double mD;
    private double sL;
    private double summD;
    private double sD;
    private long esD;
    private double ssD;
    private double rP;
    private double lw;
    private int mP;


    double mLC (int[] num){
        for (int i = 0 ; i < num.length; i++){
            double value  = (double)(num[0] + 4*num[2] + num[1])/6;
            double scale = Math.pow(10, 2);
            mLC =  (Math.ceil(value * scale) / scale);
        }
        return mLC;
    }
    double mD (int [] num){
        for (int i = 0 ; i < num.length; i++){
            double value  = (double)(num[1] - num[0])/6;
            double scale = Math.pow(10, 2);
            mD = (Math.ceil(value * scale) / scale);
        }
        return mD;
    }
    double sL(double a, double b, double c, double d){
        for (int i = 0; i< data.length; i++){
            sL = data[0]*a+data[1]*b+data[2]*c+data[3]*d;
        }
        return sL;
    }
    double summD (double a, double b, double c, double d){
        for (int i = 0; i< data.length; i++){
            double res = data[0]*Math.pow(a,2)+data[1]*Math.pow(b,2)+data[2]*Math.pow(c,2)+data[3]*Math.pow(d,2);
            double value  = Math.sqrt(res);
            double scale = Math.pow(10, 2);
            summD =  (Math.ceil(value * scale) / scale);
        }
        return summD;
    }
    double sD (){
        double value  = sL + 2 * summD;
        double scale = Math.pow(10, 2);
        sD = (Math.ceil(value * scale) / scale);
        return sD;

    }
    double esD (){
        esD = Math.round(summD / sL * 100);
        return esD;
    }
    double ssD(){
        ssD = 4 * sD;
        return ssD;
    }
    double rP (){
        double value  = ssD / 132;
        double scale = Math.pow(10, 2);
        rP = (Math.ceil(value * scale) / scale);
        return rP;
    }
    double lw (){
        double value  = ((Math.pow(rP,0.33))*2.5);
        double scale = Math.pow(10, 2);
        lw = (Math.ceil(value * scale) / scale);
        return lw;
    }
    int mP (){
        mP = (int) Math.round(rP / lw);
        return mP;
    }
}
