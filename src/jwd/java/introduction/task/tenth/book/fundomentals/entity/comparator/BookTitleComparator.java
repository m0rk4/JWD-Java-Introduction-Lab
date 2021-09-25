package jwd.java.introduction.task.tenth.book.fundomentals.entity.comparator;

import jwd.java.introduction.task.tenth.book.fundomentals.entity.Book;
import jwd.java.introduction.task.tenth.book.fundomentals.util.ObjectUtils;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        return ObjectUtils.compare(firstBook.getTitle(), secondBook.getTitle());
    }
}
