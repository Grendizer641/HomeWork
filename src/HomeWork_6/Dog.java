package HomeWork_6;

public class Dog extends Animal{
    public Dog(String name, int runLimit, int swimLimit ){
        super(name, runLimit, swimLimit);
        animalsCount++;
    }
    public Dog(String name){
        this(name, 500, 200);
    }
}

