package jwd.java.introduction.task.tenth.book.fundomentals.entity.comparator;

import jwd.java.introduction.task.tenth.book.fundomentals.entity.Book;
import jwd.java.introduction.task.tenth.book.fundomentals.util.ObjectUtils;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int titleComparisonResult = ObjectUtils.compare(firstBook.getTitle(), secondBook.getTitle());
        return titleComparisonResult == 0 ? ObjectUtils.compare(firstBook.getAuthor(), secondBook.getAuthor())
                : titleComparisonResult;
    }
}
