package lesson6;

public class Dog extends Animal {

    public static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int a) {
        if (a <= 500) {
            System.out.printf("%s пробежал %d м.\n", name, a);
        } else {
            System.out.println("Собака не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int b) {
        if (b <= 10) {
            System.out.printf("%s проплыл %d м.\n", name, b);
        } else {
            System.out.println("Собака не может проплыть больше 10 м.");
        }
    }
}
