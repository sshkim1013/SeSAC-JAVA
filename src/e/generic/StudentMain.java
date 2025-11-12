package e.generic;

class Student<T> {
    private String name;
    private T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public T getScore() {
        return score;
    }

    public boolean isPassing(double passingScore) {
        if (score instanceof Number) {
            double scoreValue =  ((Number) score).doubleValue();
            return scoreValue > passingScore;
        }
        return false;
    }
}

public class StudentMain {

    public static void main(String[] args) {
        Student<Integer> student1 = new Student<>("Kim", 100);
        System.out.println(student1.isPassing(90)); // true
        Student<Double> student2 = new Student<>("Lee", 95.5);
        Student<String> student3 = new Student<>("Park", "B+");

        Student<Integer>[] students = new Student[3];
        students[0] = new Student<>("A", 100);
        students[1] = new Student<>("B", 50);
        students[2] = new Student<>("C", 80);
    }
}
