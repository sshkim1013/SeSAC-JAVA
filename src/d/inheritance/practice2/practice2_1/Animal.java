package d.inheritance.practice2.practice2_1;

public class Animal {

    String breed;
    String name;

    public Animal(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    void makeSound() {
        System.out.println("동물 소리");
    }

    public void feedingTime(Animal animal) {
        System.out.print(animal.breed + " " + animal.name + ": ");
        animal.makeSound();
    }
}
