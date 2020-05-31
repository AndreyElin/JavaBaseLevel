package lesson6;

public abstract class Animal {

    String name;
    public static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int a);

    public abstract void swim(int b);
}
