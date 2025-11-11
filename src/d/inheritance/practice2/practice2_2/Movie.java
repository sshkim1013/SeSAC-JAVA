package d.inheritance.practice2.practice2_2;

public class Movie {

    String title;
    double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    void displayInfo() {
        System.out.println("영화 정보");
    }
}
