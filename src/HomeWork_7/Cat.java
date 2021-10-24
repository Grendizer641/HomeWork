package HomeWork_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if(plate.getFood() >= appetite){
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел(а) и сыт(а)!");
        } else {
            System.out.println("Для " + name + " в тарелке недостаточно еды");
        }

    }

    public String getName() {
        return name;
    }
}


