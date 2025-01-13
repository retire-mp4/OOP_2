import java.time.LocalDate;

public static void main(String[] args) {
    Phone phone1 = new Phone("89030515878", "TECNO SPARK 20", 190.0);
    Phone phone2 = new Phone("89061649199", "Xiaomi Redmi 10C",157.0);
    Phone phone3 = new Phone();

    System.out.println("Телефон 1: номер - " + phone1.getNumber() + ", модель - " + phone1.getModel() + ", вес - " + phone1.getWeight());
    System.out.println("Телефон 2: номер - " + phone2.getNumber() + ", модель - " + phone2.getModel() + ", вес - " + phone2.getWeight());
    System.out.println("Телефон 3: номер - " + phone3.getNumber() + ", модель - " + phone3.getModel() + ", вес - " + phone3.getWeight());

    phone1.receiveCall("Иван");
    phone2.receiveCall("Аня", "89003001123");
    phone3.receiveCall("Федор");

    System.out.println("Телефон 1: " + phone1.getNumber());

    phone1.sendMessage("89013458765", "89061610191", "89032359078");


    Reader[] readers = new Reader[3];
    readers[0] = new Reader("Чан Кристофер Бан", 12345, "Музыка", LocalDate.of(1997, 3, 10), "82 2 3182116");
    readers[1] = new Reader("Ли Минхо", 67890, "ФизМат",LocalDate.of(1999, 8, 20), "82 51 4419904");
    readers[2] = new Reader("Юмаева Анастасия Сергеевна", 24680, "Мед",LocalDate.of(2001, 1, 15), "89072347663");


    //takeBook
    readers[0].takeBook(3);
    readers[1].takeBook("Капитанская дочка", "Тяжелая лира", "Большая медицинская энциклопедия");

    Book book1 = new Book("Капитанская дочка", "Пушкин");
    Book book2 = new Book("Тяжелая лира", "Ходасевич");
    Book book3 = new Book("Большая медицинская энциклопедия", "Семашко");

    readers[2].takeBook(book1, book2, book3);


    // returnBook
    readers[0].returnBook(2);
    readers[1].returnBook("Капитанская дочка","Тяжелая лира");
    readers[2].returnBook(book1, book3);
}