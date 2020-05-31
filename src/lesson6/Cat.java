package lesson6;

public class Cat extends Animal {

    public static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int a) {
        if (a <= 200) {
            System.out.printf("%s пробежал %d м.\n", name, a);
        } else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }

    }

    @Override
    public void swim(int b) {
        System.out.println("Кот не умеет плавать!");
    }
}
