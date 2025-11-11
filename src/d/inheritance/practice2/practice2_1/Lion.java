package d.inheritance.practice2.practice2_1;

public class Lion extends Animal {

    public Lion(String breed, String name) {
        super(breed, name);
    }

    @Override
    void makeSound() {
        System.out.println("어흥!");
    }
}
