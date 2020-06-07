package lesson7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Barsik", 20);
        cats[1] = new Cat("Marsik", 15);
        cats[2] = new Cat("Arsik", 15);
        cats[3] = new Cat("Darsik", 20);
        cats[4] = new Cat("Parsik", 50);

        Plate plate = new Plate(120);

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
            System.out.println("Сытость: " + cat.isFoolness());
            System.out.println("------------------");
        }
        plate.addFood(120);
        plate.info();
    }
}
