package bookmanager;

public class BookManager {
    public static void main(String[] args) {
        Publisher publisher1 = new Publisher();
        publisher1.setCity("Velika Gorica");
        publisher1.setName("Kvaka");

        Publisher publisher2 = new Publisher();
        publisher2.setCity("Zagreb");
        publisher2.setName("Lumen");

        Author author1 = new Author();
        author1.setFirstName("Steven");
        author1.setLastName("King");

        Author author2 = new Author();
        author2.setFirstName("Slavko");
        author2.setLastName("Kolar");

        Book book1 = new Book();
        book1.setName("Isijavanje");
        book1.setYear(1990);
        book1.setAuthor(author1);
        book1.setPublisher(publisher1);

        Book book2 = new Book();
        book2.setName("Zasto kravama trebaju repovi");
        book2.setYear(2022);
        book2.setAuthor(author2);
        book2.setPublisher(publisher1);

        Book book3 = new Book();
        book3.setName("Breza");
        book3.setYear(2022);
        book3.setAuthor(author2);
        book3.setPublisher(publisher2);

        Book book4 = new Book();
        book4.setName("Mi smo za pravicu");
        book4.setYear(2022);
        book4.setAuthor(author2);
        book4.setPublisher(publisher1);

        Book book5 = new Book();
        book5.setName("Svoga tela gospodar");
        book5.setYear(1982);
        book5.setAuthor(author2);
        book5.setPublisher(publisher2);

        System.out.println();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
    }
}
