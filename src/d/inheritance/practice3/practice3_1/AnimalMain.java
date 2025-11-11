package d.inheritance.practice3.practice3_1;

public class AnimalMain {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("바둑이", 3),
                new Cat("나비", 2),
                new Bird("짹짹이", 1)
        };

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.eat();
            System.out.println();
        }
    }
}
