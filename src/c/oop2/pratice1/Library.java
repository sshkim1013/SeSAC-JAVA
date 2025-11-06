package c.oop2.pratice1;

public class Library {

    Book[] books;
    int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
        }
    }

    public void addBook(String title, String author) {
        addBook(new Book(title, author));
    }

    public void addBook(String title, String author, int price) {
        addBook(new Book(title, author, price));
    }

    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.print(i + 1 + ". ");
            books[i].displayInfo();
        }
    }

    public void searchByTitle(String keyword) {
        String key = keyword.toLowerCase();
        int bookNumber = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.contains(key)) {
                System.out.println(bookNumber + 1 + ". 제목: " + books[i].getTitle() + " - 저자: " + books[i].getAuthor() + ", 가격: " + books[i].getPrice() + "원");
                bookNumber++;
            }
        }
    }

    public void searchByAuthor(String keyword) {
        String key = keyword.toLowerCase();
        int bookNumber = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].author.contains(key)) {
                System.out.println(bookNumber + 1 + ". 제목: " + books[i].getTitle() + " - 저자: " + books[i].getAuthor() + ", 가격: " + books[i].getPrice() + "원");
                bookNumber++;
            }
        }
    }

    public int getTotalPrice() {
        int sumPrice = 0;
        for (int i = 0; i < bookCount; i++) {
            sumPrice += books[i].getPrice();
        }
        return sumPrice;
    }

    public int getAveragePrice() {
        if (bookCount == 0) {
            return 0;
        }
        return getTotalPrice() / bookCount;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void applyDiscountToAll(int percent) {
        for (int i = 0; i < bookCount; i++) {
            books[i].applyDiscount(percent);
        }
    }
}
