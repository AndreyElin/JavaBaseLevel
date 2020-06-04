package lesson6;

public class Main {

    public static void main(String[] args) {

        Animal cat1 = new Cat("Murzik");
        Animal cat2 = new Cat("Lurzik");
        Animal dog1 = new Dog("Tuzik");
        Animal dog2 = new Dog("Bobik");
        Animal dog3 = new Dog("Kashtanka");

        cat1.run(210);
        cat2.run(120);
        cat1.swim(1);

        dog1.run(300);
        dog2.run(600);
        dog3.swim(5);

        System.out.println("Котов создано: " + Cat.count);
        System.out.println("Собак создано: " + Dog.count);
        System.out.println("Всего животных: " + Animal.count);

    }
}
