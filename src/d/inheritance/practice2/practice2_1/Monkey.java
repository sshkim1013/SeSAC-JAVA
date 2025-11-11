package d.inheritance.practice2.practice2_1;

public class Monkey extends Animal {

    public Monkey(String breed, String name) {
        super(breed, name);
    }

    @Override
    void makeSound() {
        System.out.println("끼끼!");
    }
}
