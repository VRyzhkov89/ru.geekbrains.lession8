package lession7;

import java.util.Scanner;


public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int feed;
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Томас", 100, false,false);
        allCats[1] = new Cat("Чарли", 150, false, false);
        allCats[2] = new Cat("Линдор", 160, false,false);
        allCats[3] = new Cat("Цезарь", 200, false,false);
        allCats[4] = new Cat("Бегемот",500,false,false);

        System.out.println("Сколько грамм корма насыпать в миску? \nМинимальная потребность кота 100 грамм.");

        Plate plate = new Plate(scanner.nextInt());
        do {
            plate.info();
            for (Cat allCat : allCats) {
                if (allCat.alreadyEat) {
                    System.out.println("Кот " + allCat.name + " наелся и спит!");
            } else if (allCat.fullness || allCat.appetite > plate.food) {
                    System.out.println("Кот " + allCat.name + " не поел!");
                } else {
                    allCat.eat(plate);
                    allCat.fullness = true;
                    allCat.alreadyEat = true;
                    System.out.println("Кот " + allCat.name + " поел!");
                }
            }
            plate.info();
            System.out.println("Сколько грамм корма добавить еще в миску?\n0-Уйти и не добавлять еды.");
            feed = scanner.nextInt();
            plate.increaseFood(feed);
            plate.info();
        } while (feed !=0);
    }
}
