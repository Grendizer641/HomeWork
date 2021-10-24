package HomeWork_7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int foodAdd){
        food += foodAdd;
    }

}
