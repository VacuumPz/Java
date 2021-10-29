/**
 * Java 1. Homework 7
 *
 * @author Gleb
 * @version 28.10.2021
 */

class Lesson7 {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        System.out.println(plate);
        
        Cat cat0 = new Cat("Barsik", 9);
        Cat cat1 = new Cat("Marsik", 5);
        Cat cat2 = new Cat("Karasik", 1);
        
        Cat[] cats = {cat0, cat1, cat2};
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
        
        System.out.println(plate);
        plate.add(15);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    
    void setFullness(boolean status) {
        fullness = status;
    }
    
    int getAppetite() {
        return appetite;
    }
    
    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }
    
    @Override
    public String toString() {
        return "Cat " + name + ", eat: " + appetite + ". Fullness: " + fullness;
    }
}

class Plate {
    int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    int getFood() {
        return food;
    }
    
    void setFood() {
        this.food = food;
    }
    
    boolean decreaseFood(int appetite) {
        if (this.food < appetite) {
            return false;
        }
        this.food -= appetite;
        return true;
    }
    
    void add(int food) {
        this.food += food;
    }
    
    @Override
    public String toString() {
        return "Plate: " + food;
    }
}