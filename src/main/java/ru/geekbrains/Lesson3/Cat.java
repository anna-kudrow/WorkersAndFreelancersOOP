package ru.geekbrains.Lesson3;

public class Cat extends Animal{


    public static int counter;
    {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);

    }


    @Override
    public void swim(int distance) {
        System.out.println(name + " cannot swim!");
    }
}
