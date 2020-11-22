package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

        // Переменные - параметры игры
        public static final int SIZE = 3;
        public static final int DOTS_TO_WIN = 3;
        public static final int LINE_LIMIT = 15;

        // Константы • X O
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';

        // Переменные - игровое поле, работа с клавиатурой, случайные числа
        public static char[][] map;
        public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();

        // Основной метод
        public static void main(String[] args) {
                

                // Инициализация игрового поля
                initMap();

                // Вывод игрового поля
                printMap();

                // Главный игровой цикл
                while (true) {
                        // Ход игрока
                        humanTurn();
                        // Печать игрового поля
                        printMap();
                        // Проверка победителя
                        if (checkWin(DOT_X)) {
                                System.out.println("Вы победили!");
                                break;
                        }
                        // Проверка полностью заполненного поля
                        if (mapIsFull()) {
                                System.out.println("Ничья!");
                                break;
                        }
                        // Ход ИИ
                        aiTurn();
                        // Вывод игрового поля
                        printMap();
                        // Проверка победителя
                        if (checkWin(DOT_O)) {
                                System.out.println("Совершеннейшее существо победило!!!");
                                break;
                        }
                        // Проверка заполненности карты
                        if (mapIsFull()) {
                                System.out.println("Ничья!");
                                break;
                        }
                }
                // Игра закончена
                System.out.println("Игра завершена!!!");

                // Закрываем консоль
                scanner.close();
        }

        /**
         * Проверяем ничью
         */
        private static boolean mapIsFull() {
                for (int y = 0; y < SIZE; y++) {
                        for (int x = 0; x < SIZE; x++) {
                                if (map[y][x] == DOT_EMPTY) return false;
                        }
                }
                return true;
        }

        /**
         * Проверяем победу
         */
        private static boolean checkWin(char symbol) {

                for (int i = 0; i < 3; i++)

                        if ((map[i][0] == symbol && map[i][1] == symbol &&
                                map[i][2] == symbol) ||
                                (map[0][i] == symbol && map[1][i] == symbol &&
                                        map[2][i] ==symbol))
                                return true;

                if ((map[0][0] == symbol && map[1][1] == symbol &&
                        map[2][2] == symbol) ||
                        (map[2][0] == symbol && map[1][1] == symbol &&
                                map[0][2] == symbol))
                        return true;

                return false;
        }

        /**
         * Предоставляем ход компу
         */
        private static void aiTurn() {
                int x, y;
                do {
                        x = random.nextInt(SIZE); // [0 .. SIZE)
                        y = random.nextInt(SIZE);
                } while (!isCellValid(x, y));
                map[y][x] = DOT_O;
        }

        /**
         * Предоставляем ход игроку
         */
        private static void humanTurn() {
                int x, y;
                do {
                        System.out.println("Введите координаты в формате x y в диапазоне [1.." + SIZE + "]");
                        x = scanner.nextInt() - 1;
                        y = scanner.nextInt() - 1;
                } while (!isCellValid(x, y));
                map[y][x] = DOT_X;
        }

        /**
         * Проверяем возможность хода
         */
        private static boolean isCellValid(int x, int y) {
                if (x < 0 || x >= SIZE) return false;
                if (y < 0 || y >= SIZE) return false;
                if (map[y][x] != DOT_EMPTY) return false;
                return true;
        }

        /**
         * Печатаем карту
         */
        private static void printMap() {
                // Сделали отступ
                for (int i = 0; i < LINE_LIMIT; i++) {
                        System.out.println();
                }

                // Верхняя "Легенда"
                for (int i = 0; i <= SIZE; i++) {
                        System.out.print(i + " ");
                }
                System.out.println();

                // Выводим игровое поле
                for (int y = 0; y < SIZE; y++) {
                        System.out.print((y + 1) + " ");
                        for (int x = 0; x < SIZE; x++) {
                                System.out.print(map[y][x] + " ");
                        }
                        System.out.println();
                }

                // Дополнительный отступ
                System.out.println();
        }

        /**
         * Инициализируем карту
         */
        private static void initMap() {
                map = new char[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                        for (int j = 0; j < SIZE; j++) {
                                map[i][j] = DOT_EMPTY;
                        }
                }
        }

}