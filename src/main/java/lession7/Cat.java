package lession7;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullness;
    protected boolean alreadyEat;

    public Cat(String name, int appetite, boolean fullness, boolean alreadyEat) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
        this.alreadyEat = alreadyEat;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}