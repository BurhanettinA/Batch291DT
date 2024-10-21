package d21oop;

public class Cat extends Mammal {

    public void meov(){
        System.out.println("Cats meov");
    }
    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babies with milk ....");
    }
}
