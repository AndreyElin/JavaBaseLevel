package lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean foolness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.foolness = false;
    }

    public boolean isFoolness() {
        return foolness;
    }

    public void eat(Plate plate) {
        System.out.println(name + " eat...");
        if(plate.decreaseFood(appetite) == true) {
            foolness = true;
        }
    }

}
