package HomeWork_6;

public abstract class Animal {

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    protected static int animalsCount;

    public Animal(String name, int runLimit, int swimLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void swim(int obstacleValue){
        if (obstacleValue <= swimLimit){
            System.out.println(name + " проплыл(а) " + obstacleValue + " метров");
        }
        else {
            System.out.println("Длина препятсвия больше, чем " + name + " может проплыть");
        }
    }

    public void run(int obstacleValue) {
        if (obstacleValue <= runLimit){
            System.out.println(name + " пробежал(а) " + obstacleValue + " метров");
        }
        else {
            System.out.println("Длина препятсвия больше, чем " + name + " может пробежать");
        }

    }

    public void printAnimalsCount(){
        System.out.println("Общее число животных: " + animalsCount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }
}
