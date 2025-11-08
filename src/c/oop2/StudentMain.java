package c.oop2;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student("Kim", 90);
        Student student2 = new Student("Lee", 80);
        Student student3 = new Student("Jack", 70);

        System.out.println("student1 이름 = " + student1.getName());
        System.out.println("student2 이름 = " + student2.getName());
        System.out.println("student3 이름 = " + student3.getName());

        // 클래스 변수 사용
        System.out.println("총 학생 수: " + Student.getTotalStudent() + "명");
        System.out.println("평균 점수: " + Student.getAverageScore() + "점");
    }
}
