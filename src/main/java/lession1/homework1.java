package lession1;

public class homework1 {

    // 1t задание

    public static void main(String[] args) {

        System.out.println(calculate(11, 22, 33, 44));
        System.out.println(notBigger(8, 9));
        isPositiveOrNegative(-1);
        System.out.println(isNegative(10));
        greetings("Erlan");



        //2 задание

        byte number = 2;
        short littleNumber = 20;
        int standardNumber = 200;
        long bigNumber = 200000;
        float fNumber = 3.22f;
        double dNumber = 3.333;
        char symbol = 'N';
        boolean val = true;
    }

// 3 задание

    public static int calculate(int a, int b, int c, int d) {

        int result = a * (b + (c / d));
        return result;

    }

// 4 задание

    public static boolean notBigger(int a, int b) {

        return a + b >= 10 && a + b <= 20;

    }

// 5 задание

    public static void isPositiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

// 6 задание

    public static boolean isNegative(int a) {
        if (a<0) {
            return true;
        }
        return false;
    }

// 7 задание

    public static void greetings(String name) {
        System.out.println("Привет, " + name + "!");
    }

// 8 задание
}
