package d.inheritance.practice2.practice2_2;

public class Comedy extends Movie {

    String humorStyle;

    public Comedy(String title, double rating, String humorStyle) {
        super(title, rating);
        this.humorStyle = humorStyle;
    }

    @Override
    void displayInfo() {
        System.out.println("[코미디] " + title + " (평점: " + rating + ") - 유머: " + humorStyle);
    }
}
