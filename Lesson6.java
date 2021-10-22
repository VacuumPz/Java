/**
 * Java 1. Homework 6
 *
 * @author Gleb
 * @version 22.10.2021
 */

class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat ("Marsik", 100, 10, 200, 0);
        Dog dog = new Dog ("Doge", 250, 5, 500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal.infoRun());
            System.out.println(animal.infoSwim());
            System.out.println(animal);
        }
    }
}

class Cat extends Animal {
    Cat(String name, int run, int swim, int mRun, int mSwim) {
        super(name, run, swim, mRun, mSwim);
    }
    
    @Override
    public String infoRun() {
        if (run <= mRun) return "Cat run " + run + " meters.";
        else return "Cat tired of running " + run + " meters.";
    }
    @Override
    public String infoSwim() {
        if (swim <= mSwim) return "Cat swim " + swim + " meters.";
        else return "The cat drowned.";
    }
}

class Dog extends Animal {
    Dog(String name, int run, int swim, int mRun, int mSwim) {
        super(name, run, swim, mRun, mSwim);
    }
    
    
    @Override
    public String infoRun() {
        if (run <= mRun) return "Dog run " + run + " meters.";
        else return "Dog tired of running " + run + " meters.";
    }
    @Override
    public String infoSwim() {
        if (swim <= mSwim) return "Dog swim " + swim + " meters.";
        else return "The dog drowned.";
    }
}

interface IAnimal {
    String infoRun();
    String infoSwim();
}

abstract class Animal implements IAnimal {
    protected String name;
    int run;
    int swim;
    protected int mRun;
    protected int mSwim;
    
    Animal(String name, int run, int swim, int mRun, int mSwim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.mRun = mRun;
        this.mSwim = mSwim;
    }
    
    @Override
    public String toString() {
        return name + ", " + mRun + ", " + mSwim;
    }
}