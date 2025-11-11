package d.inheritance.practice2.practice2_2;

public class Drama extends Movie {

    String theme;

    public Drama(String title, double rating, String theme) {
        super(title, rating);
        this.theme = theme;
    }

    @Override
    void displayInfo() {
        System.out.println("[드라마] " + title + " (평점: " + rating + ") - 주제: " + theme);
    }
}
