package d.inheritance.practice2.practice2_2;

public class ActionMovie extends Movie {

    String specialEffects;

    public ActionMovie(String title, double rating, String specialEffects) {
        super(title, rating);
        this.specialEffects = specialEffects;
    }

    @Override
    void displayInfo() {
        System.out.println("[액션] " + title + " (평점: " + rating + ") - 특수효과: " + specialEffects);
    }
}
