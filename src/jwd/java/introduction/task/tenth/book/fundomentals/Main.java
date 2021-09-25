package jwd.java.introduction.task.tenth.book.fundomentals;

import jwd.java.introduction.task.tenth.book.fundomentals.entity.Book;
import jwd.java.introduction.task.tenth.book.fundomentals.entity.comparator.BookAuthorTitlePriceComparator;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Title", "Author", 101, "978-3-16-148410-0"),
                new Book("Title", "Author", 100, "978-3-16-148410-0")
        );
        books.sort(new BookAuthorTitlePriceComparator());
        LOGGER.log(Level.INFO, "{0}", books);
    }
}
