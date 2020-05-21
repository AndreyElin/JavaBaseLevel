package lesson3;

// Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static Scanner scanner;
    public static Random random;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        random = new Random();

        while (true) {
            guessTheNumber();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет.");
            if(scanner.nextInt() == 0) {
                break;
            }
        }

    }

    public static void guessTheNumber() {
        int numberRandom = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9!");
        for (int i = 0; i <= 3; i++) {
            if (i == 3) {
                System.out.println("Вы проиграли!");
                break;
            }

            int number = scanner.nextInt();
            if (number == numberRandom) {
                System.out.println("Вы угадали!");
                break;
            } else if (number > numberRandom) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
        }
    }
}
