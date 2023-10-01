package ru.geekbrains.Lesson3;

public class Task1 {
    public static void main(String[] args) {


        Cat cat1 = new Cat ("Tuzi", 300,200);
        Cat cat2 = new Cat ("Tuzirr", 300,200);

        System.out.println(cat1);
        System.out.println(cat2);
        Animal [] animals = {
                new Cat ("Barsik", 300, 200),
                new Cat ("Persik", 320, 100),
                new Dog ("Bistrii", 500, 20),
                new Dog ("Tuzik", 1000, 15),
                new Dog ("Sharik", 800, 30),
        };

        for (Animal a : animals) {
            a.run(200);
            a.swim(10);
            a.run(500);
            a.swim(15);
            a.run(100);
            a.swim(30);
        }


        System.out.println();
        System.out.println(Animal.getCounter() + " animals were created");
        System.out.println(Cat.getCounter() + " animals were created");
        System.out.println(Dog.getCounter() + " animals were created");




    }
}
