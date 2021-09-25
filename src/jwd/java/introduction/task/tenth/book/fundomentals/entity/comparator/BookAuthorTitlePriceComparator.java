package jwd.java.introduction.task.tenth.book.fundomentals.entity.comparator;

import jwd.java.introduction.task.tenth.book.fundomentals.entity.Book;
import jwd.java.introduction.task.tenth.book.fundomentals.util.ObjectUtils;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        BookAuthorTitleComparator authorTitleComparator = new BookAuthorTitleComparator();
        int authorTitleComparisonResult = authorTitleComparator.compare(firstBook, secondBook);
        return authorTitleComparisonResult == 0 ? ObjectUtils.compare(firstBook.getPrice(), secondBook.getPrice())
                : authorTitleComparisonResult;
    }
}