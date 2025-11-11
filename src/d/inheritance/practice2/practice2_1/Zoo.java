package d.inheritance.practice2.practice2_1;

public class Zoo {

    Animal[] animals;
    int count;

    public Zoo(int capacity) {
        this.animals = new Animal[capacity];
        this.count = 0;
    }

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }

    public void feedingTime() {
        for (int i = 0; i < count; i++) {
            System.out.print(animals[i].breed + " " + animals[i].name + ": ");
            animals[i].makeSound();
        }
    }
}
