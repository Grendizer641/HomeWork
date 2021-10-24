package HomeWork_7;

public class CatEatFromPlate {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Барсик", 5),
                new Cat("Джозя", 4),
                new Cat("Мурзик", 7),
                new Cat("Пушок", 5),
        };
        Plate plate = new Plate(15);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);

        }
        plate.info();

    }
}

