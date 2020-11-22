package lession6;

public class Cat extends Animals {//наследующий класс
    public Cat() {

        this.maxJump = 2.0;
        this.maxRun = 200;
        this.type = "Кот";

    }

    @Override
    public void swim(int dist) {
        System.out.println("Котик не хочет плавать!");
    }

}