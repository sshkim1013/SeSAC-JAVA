package d.inheritance.practice2.practice2_1;

public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("사자", "심바"),
                new Elephant("코끼리", "덤보"),
                new Monkey("원숭이", "조조")
        };

        System.out.println("=== 먹이 시간 ===");
        for (Animal animal : animals) {
            animal.feedingTime(animal);
        }
    }
}
