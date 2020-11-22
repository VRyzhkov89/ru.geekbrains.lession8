package lession3;

import java.util.Scanner;

public class homework3 {

   final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int gameCounter;

        do {
            System.out.println("Ваша задача угадать число. У вас 3 попытки.");
            playLevel();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            gameCounter = scanner.nextInt();
        } while (gameCounter == 1);

        scanner.close();

    }

    private static void playLevel() {
        int number = (int) (Math.random() * 9);
        int tryCount = 1;
        while (tryCount <= 3) {
            System.out.println("Попытка " + tryCount);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Загаданное число больше.");
            }
            if (tryCount==3) {
                System.out.println("Число попыток закончилось.");
                System.out.println("Загаданное число " + number + ".");
                System.out.println();
                System.out.println("Game over");
                System.out.println();
                break;
            }

            tryCount = tryCount + 1;
        }
    }
}
