package lesson1;

public class MainClass {
//  1.Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
//      ------------  test  ------------
        System.out.println(total(2, 4, 6, 3));
        System.out.println(inLimit(4, 6));
        evan(-8);
        System.out.println(notEvan(9));
        helloName("Stiven");
        year(1997);

    }
//  2.Создать переменные всех пройденных типов данных, и инициализировать их значения.
//    byte a = 6;
//    short b = 8;
//    int c = 10;
//    long d = 12;
//    double e = 3;
//    float f = 5;
//    boolean g = true;
//    char h = 's';
//
//    String wou = "wou";

//  3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат.
    public static double total (double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

//  4.Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах.
    public static boolean inLimit (int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            return true;
        return false;
    }

//  5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль.
    public static void evan (int a) {
        if (a >= 0)
            System.out.printf("Число %d положительное.\n", a);
        else
            System.out.printf("Число %d отрицательное \n", a);
    }

//  6.Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true.
    public static boolean notEvan (int a) {
        if (a < 0)
            return true;
        return false;
    }

//  7.метод должен вывести в консоль сообщение.
    public static void helloName (String name) {
        System.out.printf("Привет, %s! \n", name);
    }

//  8. * Написать метод, который определяет является ли год високосным.
    public static void year (int a) {
        if (a % 4 == 0 ) {
            if (a % 100 != 0 || a % 400 == 0) {
                System.out.printf("%d год високосный \n", a);
            } else {
                System.out.printf("%d год невисокосный \n", a);
            }
        } else {
            System.out.printf("%d год невисокосный \n", a);
        }
    }

}
