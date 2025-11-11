package d.inheritance.practice2.practice2_1;

public class ZooMain {

    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);
        zoo.addAnimal(new Lion("사자", "심바"));
        zoo.addAnimal(new Elephant("코끼리", "덤보"));
        zoo.addAnimal(new Monkey("원숭이", "조조"));

        zoo.feedingTime();
    }
}
