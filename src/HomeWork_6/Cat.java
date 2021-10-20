package HomeWork_6;

public class Cat extends Animal {

    public Cat(String name, int runLimit, int swimLimit ){
        super(name, runLimit, swimLimit);
        animalsCount++;
    }
    public Cat(String name){
        this(name, 200, 0);
    }
}
