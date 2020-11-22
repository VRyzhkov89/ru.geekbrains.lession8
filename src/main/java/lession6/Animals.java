package lession6;

public class Animals {

    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public void info() {
        System.out.println(this.type + " " + "Может пробежать: " + this.maxRun + " метров, может проплыть: "
                + this.maxSwim + " метров, может прыгнуть на: " + this.maxJump + " mетра.");
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " пробежал " + dist + " метров.");
        else System.out.println(this.type + " " + "не может бежать так далеко.");
    }

    public void swim(int dist) {
        if (this.maxSwim >= dist) System.out.println(this.type + " проплыл " + dist + " метров.");
        else System.out.println(this.type + " " + " не может плыть так далеко.");
    }

    public void jump(double dist) {
        if (this.maxJump >= dist) System.out.println(this.type + " прыгнул на " + dist + " метра.");
        else System.out.println(this.type + " не может прыгнуть так высоко!");
    }
}
