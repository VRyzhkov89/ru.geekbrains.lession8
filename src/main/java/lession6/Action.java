package lession6;

public class Action {

   public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.info();
        dog.info();
        System.out.println();

        dog.run(150);
        cat.run(5000);
        System.out.println();

        dog.swim(5);
        cat.swim(10);
        System.out.println();

        dog.jump(1);
        cat.jump(1.6);
        System.out.println();

    }
}
