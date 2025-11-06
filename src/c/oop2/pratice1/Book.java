package c.oop2.pratice1;

public class Book {

    String title;
    String author;
    int price;
    String isbn;

    // 제목, 저자만 받는 생성자 (가격 0, ISBN null)
    public Book(String title, String author) {
        this(title, author, 0, null);
    }

    // 제목, 저자, 가격을 받는 생성자 (ISBN null)
    public Book(String title, String author, int price) {
        this(title, author, price, null);
    }

    // 모든 필드를 받는 생성자
    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayInfo() {
        this.displayInfo(false);
        System.out.println("제목: " + title + " - 저자: " + author + ", 가격: " + price + "원");
    }

    public void displayInfo(boolean detailed) {
        if (detailed && isbn != null) {
            System.out.println("제목: " + title + " - 저자: " + author + ", 가격: " + price + ", isbn" + isbn);
        }
    }

    // percent 만큼의 % 할인 적용
    public void applyDiscount(int percent) {
        price = price * (100 - percent) / 100;
    }


    public void applyDiscount(int amount, boolean isPercent) {
        if (isPercent) {
            applyDiscount(amount);
        } else {
            price -= amount;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
