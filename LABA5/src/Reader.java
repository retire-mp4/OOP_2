import java.time.LocalDate;
import java.util.Arrays;

public class Reader {
    private String fullName;
    private int CardNumber;
    private String faculty;
    private LocalDate dateBirth;
    private String phone;

    public Reader(String fullName, int CardNumber, String faculty, LocalDate dateBirth, String phone) {
        this.fullName = fullName;
        this.CardNumber = CardNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }


    //takeBook
    public void takeBook(int cntBooks) {
        System.out.println(fullName + " взял " + cntBooks + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        System.out.println(String.join(", ", bookTitles));
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        String[] titles = Arrays.stream(books)
                .map(Book::getTitle)
                .toArray(String[]::new);
        System.out.println(String.join(", ", titles));
    }


    //returnBook
    public void returnBook(int cntBooks) {
        System.out.println(fullName + " вернул " + cntBooks + " книги.");
    }
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        System.out.println(String.join(", ", bookTitles));
    }
    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        String[] titles = Arrays.stream(books)
                .map(Book::getTitle)
                .toArray(String[]::new);
        System.out.println(String.join(", ", titles));
    }


}