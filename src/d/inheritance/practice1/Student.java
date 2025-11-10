package d.inheritance.practice1;

public class Student extends Person {

    String studentId;
    String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다. " + age + "살이고, 학번은 " + studentId + "이며, " + major + "을 전공합니다.");
    }
}
