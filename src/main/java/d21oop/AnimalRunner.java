package d21oop;

import d20staticblock_instanceblock_oop.Bird;
import d20staticblock_instanceblock_oop.Dog;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark(); //Dogs bark...
        d.feedWithMilk(); //Mammals feed their babies with milk...
        d.drink(); //Animals drink...
        d.eat();//

        Bird b = new Bird();
        b.tweet(); //Birds tweet...
        b.eat(); //Animals eat...


    }
}