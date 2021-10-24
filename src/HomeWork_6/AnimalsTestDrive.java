package HomeWork_6;

public class AnimalsTestDrive {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Джозя");
        cat1.swim(10);

        Animal dog1 = new Dog("Буза");
        dog1.run(400);

        cat1.printAnimalsCount();
    }
}
