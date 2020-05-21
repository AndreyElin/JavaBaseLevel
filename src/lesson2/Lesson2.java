package lesson2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(arrayChange()));
//        System.out.println(Arrays.toString(array()));
//        System.out.println(Arrays.toString(arrayMultiplierSix()));
//        array2d();
//        minAndMax();
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));

    }

//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] arrayChange() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            int j = i;
            if (array[j] == 0) {
                array[j] = 1;
            } else {
                array[j] = 0;
            }
        }
        return array;
    }

//    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static int[] array() {
        int[] array = new int[8];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 3;
        }
        return array;
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] arrayMultiplierSix() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void array2d() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j || i + j == table.length - 1) {
                    table [i] [j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

//    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void minAndMax() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент - " + min);
        System.out.println("Максимальный элемент - " + max);
    }

//    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//    если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//    граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int[] array) {
        int leftPart = 0;
        for (int i = 0; i < array.length; i++) {
            leftPart += array[i];
            int rightPart = 0;
            for (int j = i + 1; j < array.length; j++) {
                rightPart += array[j];
            }
                if (leftPart == rightPart) {
                    return true;
                }
        }
        return false;
    }

//    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
////    или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
////    Для усложнения задачи нельзя пользоваться вспомогательными массивами.

}
