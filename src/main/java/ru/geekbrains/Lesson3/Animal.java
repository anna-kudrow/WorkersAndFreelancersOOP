package ru.geekbrains.Lesson3;

public abstract class Animal {
    private static int counter;

    private static int idCounter;
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    private int id;

    public static int getCounter(){
        return counter;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    {
        System.out.println("Initializer Animal");
        counter++;
        id = ++idCounter;
        name = "Animal";
        maxRun = 200;
        maxSwim = 200;
    }

    static {
        System.out.println("Static Initializer Animal");
        idCounter =1000;
    }

    public Animal() {
        System.out.println("Constructor Animal");

    }

    public Animal(String name) {
        System.out.println("Constructor Animal");
        this.name = name;
        this.maxRun = 200;
        this.maxSwim = 200;

    }

    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if (distance <= maxRun) {
            System.out.printf("%s ran %d meters\n", name, distance);
        } else System.out.printf("%s couldn't run %d meters\n", name, distance);
    }
    public void swim(int distance){
        if (distance <= maxSwim) {
            System.out.printf("%s swam %d meters\n", name, distance);
        } else System.out.printf("%s couldn't swim %d meters\n", name, distance);

    }

    @Override
    public String toString() {
        return String.format("[%d] - %s", id, name);
    }
}
