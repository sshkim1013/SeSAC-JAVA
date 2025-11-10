package d.inheritance.practice1;

public class StudentMain {

    public static void main(String[] args) {
        Person person = new Person("사람", 0);
        Student student = new Student("김수환", 27, "201810719", "컴퓨터 공학");

        person.introduce();
        student.introduce();
    }
}
