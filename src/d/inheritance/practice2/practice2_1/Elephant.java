package d.inheritance.practice2.practice2_1;

public class Elephant extends Animal {

    public Elephant(String breed, String name) {
        super(breed, name);
    }

    @Override
    void makeSound() {
        System.out.println("뿌우우!");
    }
}
