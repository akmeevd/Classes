import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Преступление и наказание", new Author("Федор", "Достоевский"), 1866);
        Author author = new Author("Федор", "Достоевский");
        Book book2 = new Book("Человек в футляре", new Author("Антон", "Чехов"), 1898);
        Author author2 = new Author("Антон", "Чехов");
        book2.setPublishingYear(1900);
        System.out.printf("%s, %s %s, %d год публикации",book.getName(),author.getFirstName(), author.getLastName(),book.getPublishingYear());







    }
}