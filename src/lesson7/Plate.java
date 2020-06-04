package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount){
            if (food >= amount) {
                food -= amount;
                return true;
            } else {
                System.out.println("В тарелке мало еды!");
            }
        return false;
    }

    public void info(){
        System.out.println("Plate: " + food);
    }

    public void addFood(int wiskas) {
        food += wiskas;
    }
}
